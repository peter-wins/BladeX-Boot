package org.springblade.modules.customer.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.customer.entity.CustomerEntity;
import org.springblade.modules.customer.vo.CustomerVO;

/**
 * 客户信息表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class CustomerWrapper extends BaseEntityWrapper<CustomerEntity, CustomerVO>  {

	public static CustomerWrapper build() {
		return new CustomerWrapper();
 	}

	@Override
	public CustomerVO entityVO(CustomerEntity customer) {
		CustomerVO customerVO = BeanUtil.copy(customer, CustomerVO.class);

		//User createUser = UserCache.getUser(customer.getCreateUser());
		//User updateUser = UserCache.getUser(customer.getUpdateUser());
		//customerVO.setCreateUserName(createUser.getName());
		//customerVO.setUpdateUserName(updateUser.getName());

		return customerVO;
	}

}
