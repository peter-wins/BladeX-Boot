package org.springblade.modules.tenantpool.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springblade.core.mp.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.time.LocalDateTime;


/**
 *  实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_tenantpool")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Tenantpool对象", description = "")
public class TenantpoolEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 员工表id
	 */
	@ApiModelProperty(value = "员工表id")
	private Long bladeUserId;
	/**
	 * 租客姓名
	 */
	@ApiModelProperty(value = "租客姓名")
	private String tenantname;
	/**
	 * 租客电话
	 */
	@ApiModelProperty(value = "租客电话")
	private Long tenantPhone;
	/**
	 * 租户国籍
	 */
	@ApiModelProperty(value = "租户国籍")
	private String tenantCountry;
	/**
	 * 意向租房位置
	 */
	@ApiModelProperty(value = "意向租房位置")
	private String rentalLocation;
	/**
	 * (需求户型)1：整租一室,2:整租二室
	 */
	@ApiModelProperty(value = "(需求户型)1：整租一室,2:整租二室")
	private Integer demandType;
	/**
	 * (租户类型)1：租客, 2:业主
	 */
	@ApiModelProperty(value = "(租户类型)1：租客, 2:业主")
	private Integer tenantType;
	/**
	 * 可接受价格范围
	 */
	@ApiModelProperty(value = "可接受价格范围")
	private String priceRange;
	/**
	 * 入住周期
	 */
	@ApiModelProperty(value = "入住周期")
	private String stayPeriod;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
