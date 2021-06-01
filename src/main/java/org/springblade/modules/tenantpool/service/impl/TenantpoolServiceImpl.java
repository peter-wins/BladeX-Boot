package org.springblade.modules.tenantpool.service.impl;

import lombok.AllArgsConstructor;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.modules.tenantpool.entity.TenantFollowupEntity;
import org.springblade.modules.tenantpool.service.ITenantFollowupService;
import org.springblade.modules.tenantpool.entity.TenantpoolEntity;
import org.springblade.modules.tenantpool.mapper.TenantpoolMapper;
import org.springblade.modules.tenantpool.service.ITenantpoolService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 租客池表 服务实现类
 *
 * @author Chill
 */
@Service
@AllArgsConstructor
public class TenantpoolServiceImpl extends BaseServiceImpl<TenantpoolMapper, TenantpoolEntity> implements ITenantpoolService {

	private  final  ITenantFollowupService tenantFollowupService;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public boolean submit(TenantpoolEntity tenantpoolEntity) {
		super.save(tenantpoolEntity);
		TenantFollowupEntity tenantFollowupEntity = new TenantFollowupEntity();
		tenantFollowupEntity.setTenantpoolId(tenantpoolEntity.getId());
		tenantFollowupEntity.setContent("Input clues");
		tenantFollowupEntity.setType(1); // 1字典 录入私客
		return tenantFollowupService.save(tenantFollowupEntity);
	}
}
