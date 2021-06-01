package org.springblade.modules.tenantpool.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.tenantpool.entity.TenantpoolEntity;

/**
 * 租客池表 模型DTO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantpoolDTO extends TenantpoolEntity {

	private static final long serialVersionUID = 1L;

}
