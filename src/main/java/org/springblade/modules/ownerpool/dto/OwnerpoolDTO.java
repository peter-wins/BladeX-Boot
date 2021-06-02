package org.springblade.modules.ownerpool.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;
import org.springblade.modules.ownerpool.entity.OwnerpoolListingsDetailEntity;

import java.util.List;

/**
 *  模型DTO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OwnerpoolDTO extends OwnerpoolEntity {

	List<OwnerpoolListingsDetailEntity> listtingsDetailList;

	private static final long serialVersionUID = 1L;

}
