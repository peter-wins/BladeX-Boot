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

import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;
import org.springblade.modules.ownerpool.vo.OwnerpoolVO;
import org.springblade.modules.ownerpool.wrapper.OwnerpoolWrapper;
import org.springblade.modules.ownerpool.service.IOwnerpoolService;


/**
 *  控制器
 *
 * @author Chill
 */
@RestController
@AllArgsConstructor
@RequestMapping("/blade-ownerpool/ownerpool")
@Api(value = "业主池表", tags = "业主池表")
public class OwnerpoolController extends BladeController {

	private final IOwnerpoolService ownerpoolService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入ownerpool")
	public R<OwnerpoolEntity> detail(OwnerpoolEntity ownerpool) {
		OwnerpoolEntity detail = ownerpoolService.getOne(Condition.getQueryWrapper(ownerpool));
		return R.data(detail);
	}

	/**
	 * 分页 代码自定义代号
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入ownerpool")
	public R<IPage<OwnerpoolEntity>> list(OwnerpoolEntity ownerpool, Query query) {
		IPage<OwnerpoolEntity> pages = ownerpoolService.page(Condition.getPage(query), Condition.getQueryWrapper(ownerpool));
		return R.data(pages);
	}

	/**
	 * 新增 代码自定义代号
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入ownerpool")
	public R save(@Valid @RequestBody OwnerpoolEntity ownerpool) {
		return R.status(ownerpoolService.save(ownerpool));
	}

	/**
	 * 修改 代码自定义代号
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入ownerpool")
	public R update(@Valid @RequestBody OwnerpoolEntity ownerpool) {
		return R.status(ownerpoolService.updateById(ownerpool));
	}

	/**
	 * 新增或修改 代码自定义代号
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入ownerpool")
	public R submit(@Valid @RequestBody OwnerpoolEntity ownerpool) {
		return R.status(ownerpoolService.saveOrUpdate(ownerpool));
	}


	/**
	 * 删除 代码自定义代号
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(ownerpoolService.deleteLogic(Func.toLongList(ids)));
	}

}
