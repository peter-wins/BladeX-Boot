package org.springblade.modules.customer.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springblade.core.boot.ctrl.BladeController;
import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springblade.modules.customer.entity.CustomerEntity;
import org.springblade.modules.customer.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 客户信息表 控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-blade-develop/customer")
@Api(value = "客户信息表", tags = "客户信息表")
public class CustomerController extends BladeController {

	private final ICustomerService customerService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入customer")
	public R<CustomerEntity> detail(CustomerEntity customer) {
		CustomerEntity detail = customerService.getOne(Condition.getQueryWrapper(customer));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入customer")
	public R<IPage<CustomerEntity>> list(CustomerEntity customer, Query query) {
		IPage<CustomerEntity> pages = customerService.page(Condition.getPage(query), Condition.getQueryWrapper(customer));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入customer")
	public R save(@Valid @RequestBody CustomerEntity customer) {
		return R.status(customerService.save(customer));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入customer")
	public R update(@Valid @RequestBody CustomerEntity customer) {
		return R.status(customerService.updateById(customer));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入customer")
	public R submit(@Valid @RequestBody CustomerEntity customer) {
		return R.status(customerService.saveOrUpdate(customer));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(customerService.deleteLogic(Func.toLongList(ids)));
	}

}
