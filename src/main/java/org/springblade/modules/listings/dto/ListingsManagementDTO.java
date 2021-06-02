package org.springblade.modules.listings.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.listings.entity.ListingsManagementEntity;

/**
 *  模型DTO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ListingsManagementDTO extends ListingsManagementEntity {

	private static final long serialVersionUID = 1L;

}
