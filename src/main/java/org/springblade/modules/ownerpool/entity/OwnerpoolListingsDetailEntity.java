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
 *  实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_ownerpool_listings_detail")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "OwnerpoolListingsDetail对象", description = "")
public class OwnerpoolListingsDetailEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 业主池id
	 */
	@ApiModelProperty(value = "业主池id")
	private Long ownerpoolId;
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
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
