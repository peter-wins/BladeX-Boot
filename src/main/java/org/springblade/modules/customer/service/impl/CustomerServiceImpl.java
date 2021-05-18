package org.springblade.modules.customer.service.impl;

import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.modules.customer.entity.CustomerEntity;
import org.springblade.modules.customer.mapper.CustomerMapper;
import org.springblade.modules.customer.service.ICustomerService;
import org.springframework.stereotype.Service;

/**
 * 客户信息表 服务实现类
 *
 * @author Chill
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerMapper, CustomerEntity> implements ICustomerService {

}
