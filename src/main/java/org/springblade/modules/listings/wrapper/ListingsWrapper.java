package org.springblade.modules.listings.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.listings.entity.ListingsEntity;
import org.springblade.modules.listings.vo.ListingsVO;

/**
 * 房源信息表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class ListingsWrapper extends BaseEntityWrapper<ListingsEntity, ListingsVO>  {

	public static ListingsWrapper build() {
		return new ListingsWrapper();
 	}

	@Override
	public ListingsVO entityVO(ListingsEntity listings) {
		ListingsVO listingsVO = BeanUtil.copy(listings, ListingsVO.class);

		//User createUser = UserCache.getUser(listings.getCreateUser());
		//User updateUser = UserCache.getUser(listings.getUpdateUser());
		//listingsVO.setCreateUserName(createUser.getName());
		//listingsVO.setUpdateUserName(updateUser.getName());

		return listingsVO;
	}

}
