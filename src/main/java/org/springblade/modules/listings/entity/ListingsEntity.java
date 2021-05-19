package org.springblade.modules.listings.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springblade.core.mp.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.time.LocalDateTime;


/**
 * 房源信息表 实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_listings")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Listings对象", description = "房源信息表")
public class ListingsEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 客户id
	 */
	@ApiModelProperty(value = "客户id")
	private Long customerId;

	/**
	 * 客户电话
	 */
	@ApiModelProperty(value = "客户电话")
	private Long customerPhone;

	/**
	 * 房源名字
	 */
	@ApiModelProperty(value = "房源名字")
	private String listingName;
	/**
	 * 经纪人名字
	 */
	@ApiModelProperty(value = "经纪人名字")
	private String brokerName;
	/**
	 * 1：毛坯房，2：正常房
	 */
	@ApiModelProperty(value = "1：毛坯房，2：正常房")
	private Integer listingType;
	/**
	 * 默认 Dubai
	 */
	@ApiModelProperty(value = "默认 Dubai")
	private String area;
	/**
	 * 物业情况备注
	 */
	@ApiModelProperty(value = "物业情况备注")
	private String propertyRemarks;
	/**
	 * 上传图片URL
	 */
	@ApiModelProperty(value = "上传图片URL")
	private String imageUrl;

}
