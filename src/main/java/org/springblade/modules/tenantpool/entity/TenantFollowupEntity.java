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
 * 租客池跟进记录表 实体类
 *
 * @author Chill
 */
@Data
@TableName("bgh_tenant_followup")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "TenantFollowup对象", description = "租客池跟进记录表")
public class TenantFollowupEntity extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 租客池id
	 */
	@ApiModelProperty(value = "租客池id")
	private Long tenantpoolId;
	/**
	 * 字典 跟进类型
	 */
	@ApiModelProperty(value = "字典 跟进类型")
	private Integer type;
	/**
	 * 跟进内容
	 */
	@ApiModelProperty(value = "跟进内容")
	private String content;

}
