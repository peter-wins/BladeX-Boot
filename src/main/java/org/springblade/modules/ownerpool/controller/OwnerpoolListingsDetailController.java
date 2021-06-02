package org.springblade.modules.ownerpool.controller;

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

import org.springblade.modules.ownerpool.entity.OwnerpoolListingsDetailEntity;
import org.springblade.modules.ownerpool.vo.OwnerpoolListingsDetailVO;
import org.springblade.modules.ownerpool.wrapper.OwnerpoolListingsDetailWrapper;
import org.springblade.modules.ownerpool.service.IOwnerpoolListingsDetailService;


/**
 *  控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-ownerpool/ownerpool_listings_detail")
@Api(value = "业主池房源详情表", tags = "业主池房源详情表")
public class OwnerpoolListingsDetailController extends BladeController {

	private final IOwnerpoolListingsDetailService ownerpool_listings_detailService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入ownerpool_listings_detail")
	public R<OwnerpoolListingsDetailEntity> detail(OwnerpoolListingsDetailEntity ownerpool_listings_detail) {
		OwnerpoolListingsDetailEntity detail = ownerpool_listings_detailService.getOne(Condition.getQueryWrapper(ownerpool_listings_detail));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入ownerpool_listings_detail")
	public R<IPage<OwnerpoolListingsDetailEntity>> list(OwnerpoolListingsDetailEntity ownerpool_listings_detail, Query query) {
		IPage<OwnerpoolListingsDetailEntity> pages = ownerpool_listings_detailService.page(Condition.getPage(query), Condition.getQueryWrapper(ownerpool_listings_detail));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入ownerpool_listings_detail")
	public R save(@Valid @RequestBody OwnerpoolListingsDetailEntity ownerpool_listings_detail) {
		return R.status(ownerpool_listings_detailService.save(ownerpool_listings_detail));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入ownerpool_listings_detail")
	public R update(@Valid @RequestBody OwnerpoolListingsDetailEntity ownerpool_listings_detail) {
		return R.status(ownerpool_listings_detailService.updateById(ownerpool_listings_detail));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入ownerpool_listings_detail")
	public R submit(@Valid @RequestBody OwnerpoolListingsDetailEntity ownerpool_listings_detail) {
		return R.status(ownerpool_listings_detailService.saveOrUpdate(ownerpool_listings_detail));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(ownerpool_listings_detailService.deleteLogic(Func.toLongList(ids)));
	}

}
