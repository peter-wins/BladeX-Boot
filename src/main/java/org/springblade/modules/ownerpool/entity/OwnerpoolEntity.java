package org.springblade.modules.ownerpool.entity;

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
@TableName("bgh_ownerpool")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Ownerpool对象", description = "")
public class OwnerpoolEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 员工表id
	 */
	@ApiModelProperty(value = "员工表id")
	private Long bladeUserId;
	/**
	 * 业主姓名
	 */
	@ApiModelProperty(value = "业主姓名")
	private String ownerName;
	/**
	 * 业主电话
	 */
	@ApiModelProperty(value = "业主电话")
	private Long ownerPhone;
	/**
	 * 性别
	 */
	@ApiModelProperty(value = "性别")
	private Integer gender;
	/**
	 * 客户来源
	 */
	@ApiModelProperty(value = "客户来源")
	private String customerSource;
	/**
	 * 紧急程度
	 */
	@ApiModelProperty(value = "紧急程度")
	private String urgentDegree;
	/**
	 * 业主国籍
	 */
	@ApiModelProperty(value = "业主国籍")
	private String ownerCountry;
	/**
	 * (业主类型)1：公盘, 2:私盘
	 */
	@ApiModelProperty(value = "(业主类型)1：公盘, 2:私盘")
	private Integer ownerType;
	/**
	 * (委托类型)1：公寓(正常公寓,复式公寓), 2:独栋(连排别墅、独栋别墅)
	 */
	@ApiModelProperty(value = "(委托类型)1：公寓(正常公寓,复式公寓), 2:独栋(连排别墅、独栋别墅)")
	private Integer commissionType;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
