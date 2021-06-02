package org.springblade.modules.ownerpool.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.ownerpool.entity.OwnerpoolListingsDetailEntity;
import org.springblade.modules.ownerpool.vo.OwnerpoolListingsDetailVO;

/**
 *  包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class OwnerpoolListingsDetailWrapper extends BaseEntityWrapper<OwnerpoolListingsDetailEntity, OwnerpoolListingsDetailVO>  {

	public static OwnerpoolListingsDetailWrapper build() {
		return new OwnerpoolListingsDetailWrapper();
 	}

	@Override
	public OwnerpoolListingsDetailVO entityVO(OwnerpoolListingsDetailEntity ownerpool_listings_detail) {
		OwnerpoolListingsDetailVO ownerpool_listings_detailVO = BeanUtil.copy(ownerpool_listings_detail, OwnerpoolListingsDetailVO.class);

		//User createUser = UserCache.getUser(ownerpool_listings_detail.getCreateUser());
		//User updateUser = UserCache.getUser(ownerpool_listings_detail.getUpdateUser());
		//ownerpool_listings_detailVO.setCreateUserName(createUser.getName());
		//ownerpool_listings_detailVO.setUpdateUserName(updateUser.getName());

		return ownerpool_listings_detailVO;
	}

}
