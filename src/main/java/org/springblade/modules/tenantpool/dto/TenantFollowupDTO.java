package org.springblade.modules.tenantpool.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.tenantpool.entity.TenantFollowupEntity;

/**
 * 租客池跟进记录表 模型DTO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantFollowupDTO extends TenantFollowupEntity {

	private static final long serialVersionUID = 1L;

}
