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
 * 业主池房源详情表 实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_ownerpool_listings_detail")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "OwnerpoolListingsDetail对象", description = "业主池房源详情表")
public class OwnerpoolListingsDetailEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 业主池id
	 */
	@ApiModelProperty(value = "业主池id")
	private Long ownerpoolId;
	/**
	 * 城市
	 */
	@ApiModelProperty(value = "城市")
	private String city;
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
	 * 房子本身年限
	 */
	@ApiModelProperty(value = "房子本身年限")
	private String hourseYears;
	/**
	 * (委托类型)1:正常公寓,2:复式公寓, 3:连排别墅、4:独栋别墅)
	 */
	@ApiModelProperty(value = "(委托类型)1:正常公寓,2:复式公寓, 3:连排别墅、4:独栋别墅)")
	private Integer commissionType;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
