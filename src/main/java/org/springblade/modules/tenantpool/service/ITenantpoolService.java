package org.springblade.modules.tenantpool.service;

import org.springblade.core.mp.base.BaseService;
import org.springblade.modules.tenantpool.entity.TenantpoolEntity;

/**
 * 租客池表 服务类
 *
 * @author Chill
 */
public interface ITenantpoolService extends BaseService<TenantpoolEntity> {
	boolean submit(TenantpoolEntity tenantpoolEntity);
}
