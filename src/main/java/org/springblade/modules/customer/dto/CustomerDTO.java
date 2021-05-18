package org.springblade.modules.customer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.customer.entity.CustomerEntity;

/**
 * 客户信息表 模型DTO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerDTO extends CustomerEntity {

	private static final long serialVersionUID = 1L;

}
