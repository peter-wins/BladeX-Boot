package org.springblade.modules.ownerpool.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.ownerpool.entity.TenantFollowupEntity;
import org.springblade.modules.ownerpool.vo.TenantFollowupVO;

/**
 * 租客池跟进记录表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class TenantFollowupWrapper extends BaseEntityWrapper<TenantFollowupEntity, TenantFollowupVO>  {

	public static TenantFollowupWrapper build() {
		return new TenantFollowupWrapper();
 	}

	@Override
	public TenantFollowupVO entityVO(TenantFollowupEntity tenant_followup) {
		TenantFollowupVO tenant_followupVO = BeanUtil.copy(tenant_followup, TenantFollowupVO.class);

		//User createUser = UserCache.getUser(tenant_followup.getCreateUser());
		//User updateUser = UserCache.getUser(tenant_followup.getUpdateUser());
		//tenant_followupVO.setCreateUserName(createUser.getName());
		//tenant_followupVO.setUpdateUserName(updateUser.getName());

		return tenant_followupVO;
	}

}
