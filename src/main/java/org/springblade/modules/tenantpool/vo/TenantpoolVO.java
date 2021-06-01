package org.springblade.modules.tenantpool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springblade.modules.tenantpool.entity.TenantpoolEntity;

import java.util.List;

/**
 * 租客池表 模型VO
 *
 * @author Chill
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantpoolVO extends TenantpoolEntity {
	String genderValue;
	String customerSourceValue;
	String demandTypeValue;
	String tenantTypeValue;
	String priceRangeValue;
	String stayPeriodValue;
	String urgentDegreeValue;
	List<TenantFollowupVO> tenantFollowupVOList;
	private static final long serialVersionUID = 1L;

}
