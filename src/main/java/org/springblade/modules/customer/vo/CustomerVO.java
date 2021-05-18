package org.springblade.modules.customer.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.customer.entity.CustomerEntity;

/**
 * 客户信息表 模型VO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerVO extends CustomerEntity {

	private static final long serialVersionUID = 1L;

}
