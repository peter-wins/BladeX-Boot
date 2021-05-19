package org.springblade.modules.listings.controller;

import io.swagger.annotations.Api;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;

import javax.annotation.Resource;
import javax.validation.Valid;
import org.springblade.core.boot.ctrl.BladeController;
import org.springblade.common.constant.CommonConstant;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springblade.modules.customer.entity.CustomerEntity;
import org.springblade.modules.customer.service.ICustomerService;
import org.springblade.modules.customer.vo.CustomerVO;
import org.springblade.modules.customer.wrapper.CustomerWrapper;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;

import org.springblade.modules.listings.entity.ListingsEntity;
import org.springblade.modules.listings.vo.ListingsVO;
import org.springblade.modules.listings.wrapper.ListingsWrapper;
import org.springblade.modules.listings.service.IListingsService;


/**
 * 房源信息表 控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-listings/listings")
@Api(value = "房源信息表", tags = "房源信息表")
public class ListingsController extends BladeController {

	private final IListingsService listingsService;

	@Resource
	private ICustomerService iCustomerService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入listings")
	public R<ListingsEntity> detail(ListingsEntity listings) {
		ListingsEntity detail = listingsService.getOne(Condition.getQueryWrapper(listings));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入listings")
	public R<IPage<ListingsEntity>> list(ListingsEntity listings, Query query) {
		IPage<ListingsEntity> pages = listingsService.page(Condition.getPage(query), Condition.getQueryWrapper(listings));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入listings")
	public R save(@Valid @RequestBody ListingsEntity listings) {
		//获取当前登录用户id  存入到 customerId 当中
		CustomerEntity customerEntity = iCustomerService.findByPhone(listings.getCustomerPhone());
		listings.setCustomerPhone(customerEntity.getCustomerPhone());
		return R.status(listingsService.save(listings));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入listings")
	public R update(@Valid @RequestBody ListingsEntity listings) {
		return R.status(listingsService.updateById(listings));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入listings")
	public R submit(@Valid @RequestBody ListingsEntity listings) {
		return R.status(listingsService.saveOrUpdate(listings));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(listingsService.deleteLogic(Func.toLongList(ids)));
	}

}
