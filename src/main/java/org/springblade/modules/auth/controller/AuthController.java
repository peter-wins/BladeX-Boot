/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.modules.auth.controller;

import com.github.xiaoymin.knife4j.annotations.ApiSort;
import com.wf.captcha.SpecCaptcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springblade.common.cache.CacheNames;
import org.springblade.core.launch.constant.AppConstant;
import org.springblade.core.log.annotation.ApiLog;
import org.springblade.core.redis.cache.BladeRedisCache;
import org.springblade.core.tool.support.Kv;
import org.springblade.core.tool.utils.Func;
import org.springblade.core.tool.utils.WebUtil;
import org.springblade.modules.auth.granter.ITokenGranter;
import org.springblade.modules.auth.granter.TokenGranterBuilder;
import org.springblade.modules.auth.granter.TokenParameter;
import org.springblade.modules.auth.utils.TokenUtil;
import org.springblade.modules.system.entity.UserInfo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.time.Duration;
import java.util.UUID;

/**
 * 认证模块
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping(AppConstant.APPLICATION_AUTH_NAME)
@ApiSort(1)
@Api(value = "用户授权认证", tags = "授权接口")
public class AuthController {

	private BladeRedisCache redisCache;

	@ApiLog("登录用户验证")
	@PostMapping("/oauth/token")
	@ApiOperation(value = "获取认证token", notes = "传入租户ID:tenantId,账号:account,密码:password")
	public Kv token(@ApiParam(value = "租户ID", required = true) @RequestParam String tenantId,
					@ApiParam(value = "账号", required = true) @RequestParam(required = false) String username,
					@ApiParam(value = "密码", required = true) @RequestParam(required = false) String password) {

		Kv authInfo = Kv.create();

		String grantType = WebUtil.getRequest().getParameter("grant_type");
		String refreshToken = WebUtil.getRequest().getParameter("refresh_token");

		String userType = Func.toStr(WebUtil.getRequest().getHeader(TokenUtil.USER_TYPE_HEADER_KEY), TokenUtil.DEFAULT_USER_TYPE);

		TokenParameter tokenParameter = new TokenParameter();
		tokenParameter.getArgs().set("tenantId", tenantId).set("username", username).set("password", password).set("grantType", grantType).set("refreshToken", refreshToken).set("userType", userType);

		ITokenGranter granter = TokenGranterBuilder.getGranter(grantType);
		UserInfo userInfo = granter.grant(tokenParameter);

		if (userInfo == null || userInfo.getUser() == null) {
			return authInfo.set("error_code", HttpServletResponse.SC_BAD_REQUEST).set("error_description", "用户名或密码不正确");
		}

		if (Func.isEmpty(userInfo.getRoles())) {
			return authInfo.set("error_code", HttpServletResponse.SC_BAD_REQUEST).set("error_description", "未获得用户的角色信息");
		}

		return TokenUtil.createAuthInfo(userInfo);
	}

	@GetMapping("/oauth/captcha")
	public Kv captcha() {
		SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
		String verCode = specCaptcha.text().toLowerCase();
		String key = UUID.randomUUID().toString();
		// 存入redis并设置过期时间为30分钟
		redisCache.setEx(CacheNames.CAPTCHA_KEY + key, verCode, Duration.ofMinutes(30));
		// 将key和base64返回给前端
		return Kv.create().set("key", key).set("image", specCaptcha.toBase64());
	}

}
