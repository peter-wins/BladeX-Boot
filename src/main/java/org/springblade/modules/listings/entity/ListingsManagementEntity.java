package org.springblade.modules.listings.entity;

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
@TableName("bgh_listings_management")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ListingsManagement对象", description = "")
public class ListingsManagementEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 客户id
	 */
	@ApiModelProperty(value = "客户id")
	private Long customerId;
	/**
	 * 所属机构
	 */
	@ApiModelProperty(value = "所属机构")
	private Long deptId;
	/**
	 * (房源类型)1：公寓, 2:独栋(保姆房、司机房)
	 */
	@ApiModelProperty(value = "(房源类型)1：公寓, 2:独栋(保姆房、司机房)")
	private Integer listingsType;
	/**
	 * 房源编号
	 */
	@ApiModelProperty(value = "房源编号")
	private String listingsNumber;
	/**
	 * 看房人姓名
	 */
	@ApiModelProperty(value = "看房人姓名")
	private String houseInspectorName;
	/**
	 * 区域
	 */
	@ApiModelProperty(value = "区域")
	private String area;
	/**
	 * 谷歌链接位置
	 */
	@ApiModelProperty(value = "谷歌链接位置")
	private String googleLocation;
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
	 * 泳池状态 1:有泳池、2:没泳池
	 */
	@ApiModelProperty(value = "泳池状态 1:有泳池、2:没泳池")
	private Integer swimmingPoolStatus;
	/**
	 * 预定信息
	 */
	@ApiModelProperty(value = "预定信息")
	private String scheduledInfo;
	/**
	 * 户型
	 */
	@ApiModelProperty(value = "户型")
	private String unitType;
	/**
	 * 面积
	 */
	@ApiModelProperty(value = "面积")
	private String rentArea;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
