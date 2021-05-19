package org.springblade.modules.listings.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.listings.entity.ListingsEntity;

/**
 * 房源信息表 模型DTO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ListingsDTO extends ListingsEntity {

	private static final long serialVersionUID = 1L;

}
