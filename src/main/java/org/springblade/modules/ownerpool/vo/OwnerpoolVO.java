package org.springblade.modules.ownerpool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;

/**
 *  模型VO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OwnerpoolVO extends OwnerpoolEntity {

	String genderValue;
	String customerSourceValue;
	String ownerTypeValue;
	String commissionTypeValue;

	private static final long serialVersionUID = 1L;

}
