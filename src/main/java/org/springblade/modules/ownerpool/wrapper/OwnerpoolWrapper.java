package org.springblade.modules.ownerpool.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.ownerpool.cache.DictOwnerCache;
import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;
import org.springblade.modules.ownerpool.enums.DictOwnerEnum;
import org.springblade.modules.ownerpool.vo.OwnerpoolVO;
import org.springblade.modules.tenantpool.vo.TenantpoolVO;

/**
 *  包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class OwnerpoolWrapper extends BaseEntityWrapper<OwnerpoolEntity, OwnerpoolVO>  {

	public static OwnerpoolWrapper build() {
		return new OwnerpoolWrapper();
 	}

	@Override
	public OwnerpoolVO entityVO(OwnerpoolEntity ownerpool) {
		OwnerpoolVO ownerpoolVO = BeanUtil.copy(ownerpool, OwnerpoolVO.class);
		ownerpoolVO.setGenderValue(DictOwnerCache.getValue(DictOwnerEnum.GENDER,ownerpool.getGender()));
		ownerpoolVO.setCustomerSourceValue(DictOwnerCache.getValue(DictOwnerEnum.CUSTOMER_SOURCE,ownerpool.getCustomerSource()));
		ownerpoolVO.setOwnerTypeValue(DictOwnerCache.getValue(DictOwnerEnum.OWNER_TYPE,ownerpool.getOwnerType()));
		ownerpoolVO.setCommissionTypeValue(DictOwnerCache.getValue(DictOwnerEnum.COMMISSION_TYPE,ownerpool.getCommissionType()));
		//User createUser = UserCache.getUser(ownerpool.getCreateUser());
		//User updateUser = UserCache.getUser(ownerpool.getUpdateUser());
		//ownerpoolVO.setCreateUserName(createUser.getName());
		//ownerpoolVO.setUpdateUserName(updateUser.getName());

		return ownerpoolVO;
	}

}
