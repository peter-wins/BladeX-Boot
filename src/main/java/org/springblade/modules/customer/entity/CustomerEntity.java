package org.springblade.modules.customer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springblade.core.mp.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.time.LocalDateTime;


/**
 * 客户信息表 实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_customer")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Customer对象", description = "客户信息表")
public class CustomerEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名")
	private String username;
	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;
	/**
	 * 昵称
	 */
	@ApiModelProperty(value = "昵称")
	private String nickname;
	/**
	 * 客户电话
	 */
	@ApiModelProperty(value = "客户电话")
	private Long customerPhone;
	/**
	 * (客户类型)1：房东,2:租户
	 */
	@ApiModelProperty(value = "(客户类型)1：房东,2:租户")
	private Integer customerType;
	/**
	 * 租户邮箱
	 */
	@ApiModelProperty(value = "租户邮箱")
	private String email;
	/**
	 * 租户地址
	 */
	@ApiModelProperty(value = "租户地址")
	private String address;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

}
