package org.springblade.modules.listings.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.listings.entity.ListingsEntity;

/**
 * 房源信息表 模型VO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ListingsVO extends ListingsEntity {

	private static final long serialVersionUID = 1L;

}
