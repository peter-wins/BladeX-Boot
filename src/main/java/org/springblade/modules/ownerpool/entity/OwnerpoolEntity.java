package org.springblade.modules.ownerpool.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springblade.core.mp.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.time.LocalDateTime;


/**
 * 业主池表 实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_ownerpool")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Ownerpool对象", description = "业主池表")
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
	private int gender;
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
	 * 房源地址
	 */
	@ApiModelProperty(value = "房源地址")
	private String listingsAddress;
	/**
	 * 房源编号
	 */
	@ApiModelProperty(value = "房源编号")
	private String listingsNumber;
	/**
	 * (装修状况)1：精装, 2:毛坯,3:简装,4:豪华装
	 */
	@ApiModelProperty(value = "(装修状况)1：精装, 2:毛坯,3:简装,4:豪华装")
	private Integer decorationSituation;
	/**
	 * 室
	 */
	@ApiModelProperty(value = "室")
	private String room;
	/**
	 * 厅
	 */
	@ApiModelProperty(value = "厅")
	private String hall;
	/**
	 * 厨
	 */
	@ApiModelProperty(value = "厨")
	private String kitchen;
	/**
	 * 卫
	 */
	@ApiModelProperty(value = "卫")
	private String guard;
	/**
	 * 房源图片、房源小视频
	 */
	@ApiModelProperty(value = "房源图片、房源小视频")
	private String imageUrl;
	/**
	 * 面积
	 */
	@ApiModelProperty(value = "面积")
	private String rentArea;
	/**
	 * 收房报价
	 */
	@ApiModelProperty(value = "收房报价")
	private BigDecimal rentPrice;
	/**
	 * 房子年限
	 */
	@ApiModelProperty(value = "房子年限")
	private String hourseYears;
	/**
	 * (免租状态)1：接受, 2:不接受
	 */
	@ApiModelProperty(value = "(免租状态)1：接受, 2:不接受")
	private Integer rentFreeStatus;
	/**
	 * 项目地址
	 */
	@ApiModelProperty(value = "项目地址")
	private String projectAddress;
	/**
	 * 房型数量
	 */
	@ApiModelProperty(value = "房型数量")
	private String listingsCount;
	/**
	 * 房间数量
	 */
	@ApiModelProperty(value = "房间数量")
	private String roomCount;
	/**
	 * 期望价格
	 */
	@ApiModelProperty(value = "期望价格")
	private BigDecimal expectPrice;
	/**
	 * 期望委托年限
	 */
	@ApiModelProperty(value = "期望委托年限")
	private String expectYears;
	/**
	 * 项目图片
	 */
	@ApiModelProperty(value = "项目图片")
	private String projectIamgeUrl;
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
