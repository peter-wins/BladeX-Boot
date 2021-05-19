package org.springblade.modules.customer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springblade.modules.customer.entity.CustomerEntity;

/**
 * 客户信息表 Mapper 接口
 *
 * @author Chill
 */
@Mapper
public interface CustomerMapper extends BaseMapper<CustomerEntity> {

	CustomerEntity findByPhone(@Param("findByPhone") Long findByPhone);

}
