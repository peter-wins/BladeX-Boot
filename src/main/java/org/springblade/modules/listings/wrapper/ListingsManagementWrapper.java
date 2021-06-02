package org.springblade.modules.listings.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.listings.entity.ListingsManagementEntity;
import org.springblade.modules.listings.vo.ListingsManagementVO;

/**
 *  包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class ListingsManagementWrapper extends BaseEntityWrapper<ListingsManagementEntity, ListingsManagementVO>  {

	public static ListingsManagementWrapper build() {
		return new ListingsManagementWrapper();
 	}

	@Override
	public ListingsManagementVO entityVO(ListingsManagementEntity listings_management) {
		ListingsManagementVO listings_managementVO = BeanUtil.copy(listings_management, ListingsManagementVO.class);

		//User createUser = UserCache.getUser(listings_management.getCreateUser());
		//User updateUser = UserCache.getUser(listings_management.getUpdateUser());
		//listings_managementVO.setCreateUserName(createUser.getName());
		//listings_managementVO.setUpdateUserName(updateUser.getName());

		return listings_managementVO;
	}

}
