package org.springblade.modules.ownerpool.service.impl;

import lombok.AllArgsConstructor;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.core.tool.utils.Func;
import org.springblade.modules.ownerpool.dto.OwnerpoolDTO;
import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;
import org.springblade.modules.ownerpool.entity.OwnerpoolListingsDetailEntity;
import org.springblade.modules.ownerpool.mapper.OwnerpoolMapper;
import org.springblade.modules.ownerpool.service.IOwnerpoolListingsDetailService;
import org.springblade.modules.ownerpool.service.IOwnerpoolService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 服务实现类
 *
 * @author Chill
 */
@Service
@AllArgsConstructor
public class OwnerpoolServiceImpl extends BaseServiceImpl<OwnerpoolMapper, OwnerpoolEntity> implements IOwnerpoolService {

	IOwnerpoolListingsDetailService ownerpoolListingsDetailService;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public boolean appToSave(OwnerpoolDTO ownerpool) {
		super.save(ownerpool);
		if (Func.isNotEmpty(ownerpool.getListtingsDetailList())) {
			ownerpool.getListtingsDetailList().forEach(ownerpoolListingsDetailEntity -> {
				ownerpoolListingsDetailEntity.setOwnerpoolId(ownerpool.getId());
			});
			ownerpoolListingsDetailService.saveBatch(ownerpool.getListtingsDetailList());
		}

		return true;
	}
}
