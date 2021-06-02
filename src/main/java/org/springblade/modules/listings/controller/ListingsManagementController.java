package org.springblade.modules.listings.controller;

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

import org.springblade.modules.listings.entity.ListingsManagementEntity;
import org.springblade.modules.listings.vo.ListingsManagementVO;
import org.springblade.modules.listings.wrapper.ListingsManagementWrapper;
import org.springblade.modules.listings.service.IListingsManagementService;


/**
 *  控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-listings/listings_management")
@Api(value = "", tags = "")
public class ListingsManagementController extends BladeController {

	private final IListingsManagementService listings_managementService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入listings_management")
	public R<ListingsManagementEntity> detail(ListingsManagementEntity listings_management) {
		ListingsManagementEntity detail = listings_managementService.getOne(Condition.getQueryWrapper(listings_management));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入listings_management")
	public R<IPage<ListingsManagementEntity>> list(ListingsManagementEntity listings_management, Query query) {
		IPage<ListingsManagementEntity> pages = listings_managementService.page(Condition.getPage(query), Condition.getQueryWrapper(listings_management));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入listings_management")
	public R save(@Valid @RequestBody ListingsManagementEntity listings_management) {
		return R.status(listings_managementService.save(listings_management));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入listings_management")
	public R update(@Valid @RequestBody ListingsManagementEntity listings_management) {
		return R.status(listings_managementService.updateById(listings_management));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入listings_management")
	public R submit(@Valid @RequestBody ListingsManagementEntity listings_management) {
		return R.status(listings_managementService.saveOrUpdate(listings_management));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(listings_managementService.deleteLogic(Func.toLongList(ids)));
	}

}
