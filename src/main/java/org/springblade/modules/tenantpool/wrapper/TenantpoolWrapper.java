package org.springblade.modules.tenantpool.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.tenantpool.entity.TenantpoolEntity;
import org.springblade.modules.tenantpool.vo.TenantpoolVO;

/**
 * 租客池表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class TenantpoolWrapper extends BaseEntityWrapper<TenantpoolEntity, TenantpoolVO>  {

	public static TenantpoolWrapper build() {
		return new TenantpoolWrapper();
 	}

	@Override
	public TenantpoolVO entityVO(TenantpoolEntity tenantpool) {
		TenantpoolVO tenantpoolVO = BeanUtil.copy(tenantpool, TenantpoolVO.class);

		//User createUser = UserCache.getUser(tenantpool.getCreateUser());
		//User updateUser = UserCache.getUser(tenantpool.getUpdateUser());
		//tenantpoolVO.setCreateUserName(createUser.getName());
		//tenantpoolVO.setUpdateUserName(updateUser.getName());

		return tenantpoolVO;
	}

}
