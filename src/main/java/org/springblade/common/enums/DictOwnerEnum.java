/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务字典枚举类
 *
 * @author Chill
 */
@Getter
@AllArgsConstructor
public enum DictOwnerEnum {

	/**
	 * 租户线索池
	 */
	GENDER("gender"),
	OWNER_TYPE("owner_type"),
	TENANTPOOL_CUSTOMER_SOURCE("tenantpool_customer_source"),
	TENANTPOOL_PRICE_RANGE("tenantpool_price_range"),
	TENANTPOOL_OTHER_DEMAND("tenantpool_other_demand"),
	TENANTPOOL_STATUS("tenantpool_status"),
	TENANTPOOL_URGENT_DEGREE("tenantpool_urgent_degree"),
	TENANTPOOL_STAY_PERIOD("tenantpool_stay_period"),

	/**
	 * 租客跟进记录
	 */
	TENANT_FOLLOWUP_TYPE_VALUE("tenant_followup_type_value");

	final String name;

}
