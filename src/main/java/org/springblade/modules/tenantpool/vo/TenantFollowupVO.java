package org.springblade.modules.ownerpool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.ownerpool.entity.TenantFollowupEntity;

/**
 * 租客池跟进记录表 模型VO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantFollowupVO extends TenantFollowupEntity {

	private static final long serialVersionUID = 1L;

}
