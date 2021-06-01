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
 * 租客池表 实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_tenantpool")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Tenantpool对象", description = "租客池表")
public class TenantpoolEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户表id
	 */
	@ApiModelProperty(value = "用户表id")
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
	 * 字典 性别
	 */
	@ApiModelProperty(value = "字典 性别")
	private Integer gender;
	/**
	 * 字典 客户来源 1中介 2来访 ....
	 */
	@ApiModelProperty(value = "字典 客户来源 1中介 2来访 ....")
	private Integer customerSource;
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
	 * (租户类型)1：私客, 2:公客
	 */
	@ApiModelProperty(value = "(租户类型)1：私客, 2:公客")
	private Integer tenantType;
	/**
	 * 字典 其他需求标签
	 */
	@ApiModelProperty(value = "字典 其他需求标签")
	private Integer otheTable;
	/**
	 * 字典 可接受价格范围 1:<=1000 2:1001-1500 .....
	 */
	@ApiModelProperty(value = "字典 可接受价格范围 1:<=1000 2:1001-1500 .....")
	private Integer priceRange;
	/**
	 * 其他联系方式
	 */
	@ApiModelProperty(value = "其他联系方式")
	private String otherContact;
	/**
	 * 字典 入住周期 1一个月 2三个月 3半年 .....
	 */
	@ApiModelProperty(value = "字典 入住周期 1一个月 2三个月 3半年 .....")
	private Integer stayPeriod;
	/**
	 * 字典 紧急程度  1紧急 2一般 3暂缓 4更久
	 */
	@ApiModelProperty(value = "字典 紧急程度  1紧急 2一般 3暂缓 4更久")
	private Integer urgentDegree;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
