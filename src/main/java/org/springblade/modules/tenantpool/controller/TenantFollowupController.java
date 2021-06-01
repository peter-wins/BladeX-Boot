package org.springblade.modules.tenantpool.controller;

import io.swagger.annotations.Api;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import javax.validation.Valid;
import org.springblade.core.boot.ctrl.BladeController;
import org.springblade.common.constant.CommonConstant;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.springblade.modules.tenantpool.entity.TenantFollowupEntity;
import org.springblade.modules.tenantpool.vo.TenantFollowupVO;
import org.springblade.modules.tenantpool.wrapper.TenantFollowupWrapper;
import org.springblade.modules.tenantpool.service.ITenantFollowupService;


/**
 * 租客池跟进记录表 控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-ownerpool/tenant_followup")
@Api(value = "租客池跟进记录表", tags = "租客池跟进记录表")
public class TenantFollowupController extends BladeController {

	private final ITenantFollowupService tenant_followupService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入tenant_followup")
	public R<TenantFollowupEntity> detail(TenantFollowupEntity tenant_followup) {
		TenantFollowupEntity detail = tenant_followupService.getOne(Condition.getQueryWrapper(tenant_followup));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入tenant_followup")
	public R<IPage<TenantFollowupEntity>> list(TenantFollowupEntity tenant_followup, Query query) {
		IPage<TenantFollowupEntity> pages = tenant_followupService.page(Condition.getPage(query), Condition.getQueryWrapper(tenant_followup));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入tenant_followup")
	public R save(@Valid @RequestBody TenantFollowupEntity tenant_followup) {
		return R.status(tenant_followupService.save(tenant_followup));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入tenant_followup")
	public R update(@Valid @RequestBody TenantFollowupEntity tenant_followup) {
		return R.status(tenant_followupService.updateById(tenant_followup));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入tenant_followup")
	public R submit(@Valid @RequestBody TenantFollowupEntity tenant_followup) {
		return R.status(tenant_followupService.saveOrUpdate(tenant_followup));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(tenant_followupService.deleteLogic(Func.toLongList(ids)));
	}

}
