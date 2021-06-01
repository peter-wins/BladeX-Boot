package org.springblade.modules.tenantpool.wrapper;

import org.springblade.common.cache.DictBizCache;
import org.springblade.common.cache.UserCache;
import org.springblade.common.enums.DictBizEnum;
import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.DateTimeUtil;
import org.springblade.core.tool.utils.DateUtil;
import org.springblade.modules.tenantpool.entity.TenantFollowupEntity;
import org.springblade.modules.tenantpool.vo.TenantFollowupVO;
import org.springblade.modules.system.entity.User;

/**
 * 租客池跟进记录表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class TenantFollowupWrapper extends BaseEntityWrapper<TenantFollowupEntity, TenantFollowupVO> {

	public static TenantFollowupWrapper build() {
		return new TenantFollowupWrapper();
	}

	@Override
	public TenantFollowupVO entityVO(TenantFollowupEntity tenantFollowup) {
		TenantFollowupVO tenant_followupVO = BeanUtil.copy(tenantFollowup, TenantFollowupVO.class);
		User user = UserCache.getUser(tenantFollowup.getCreateUser());
		tenant_followupVO.setUserName(user.getName());
		tenant_followupVO.setTypeValue(DictBizCache.getValue(DictBizEnum.TENANT_FOLLOWUP_TYPE_VALUE, tenantFollowup.getType()));
		tenant_followupVO.setCreateTimeTimestamp(DateUtil.toMilliseconds(DateUtil.fromDate(tenant_followupVO.getCreateTime())));
		//User createUser = UserCache.getUser(tenant_followup.getCreateUser());
		//User updateUser = UserCache.getUser(tenant_followup.getUpdateUser());
		//tenant_followupVO.setCreateUserName(createUser.getName());
		//tenant_followupVO.setUpdateUserName(updateUser.getName());

		return tenant_followupVO;
	}

}
