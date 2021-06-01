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

import org.springblade.modules.tenantpool.entity.TenantpoolEntity;
import org.springblade.modules.tenantpool.vo.TenantpoolVO;
import org.springblade.modules.tenantpool.wrapper.TenantpoolWrapper;
import org.springblade.modules.tenantpool.service.ITenantpoolService;


/**
 * 租客池表 控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-tenantpool/tenantpool")
@Api(value = "租客池表", tags = "租客池表")
public class TenantpoolController extends BladeController {

	private final ITenantpoolService tenantpoolService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入tenantpool")
	public R<TenantpoolEntity> detail(TenantpoolEntity tenantpool) {
		TenantpoolEntity detail = tenantpoolService.getOne(Condition.getQueryWrapper(tenantpool));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入tenantpool")
	public R<IPage<TenantpoolEntity>> list(TenantpoolEntity tenantpool, Query query) {
		IPage<TenantpoolEntity> pages = tenantpoolService.page(Condition.getPage(query), Condition.getQueryWrapper(tenantpool));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入tenantpool")
	public R save(@Valid @RequestBody TenantpoolEntity tenantpool) {
		return R.status(tenantpoolService.submit(tenantpool));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入tenantpool")
	public R update(@Valid @RequestBody TenantpoolEntity tenantpool) {
		return R.status(tenantpoolService.updateById(tenantpool));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入tenantpool")
	public R submit(@Valid @RequestBody TenantpoolEntity tenantpool) {
		return R.status(tenantpoolService.saveOrUpdate(tenantpool));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(tenantpoolService.deleteLogic(Func.toLongList(ids)));
	}

}
