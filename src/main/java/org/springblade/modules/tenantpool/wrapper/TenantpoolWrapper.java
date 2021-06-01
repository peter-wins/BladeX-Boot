package org.springblade.modules.tenantpool.wrapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springblade.common.cache.DictBizCache;
import org.springblade.common.cache.DictCache;
import org.springblade.common.enums.DictBizEnum;
import org.springblade.common.enums.DictEnum;
import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.SpringUtil;
import org.springblade.modules.tenantpool.entity.TenantFollowupEntity;
import org.springblade.modules.tenantpool.service.ITenantFollowupService;
import org.springblade.modules.tenantpool.wrapper.TenantFollowupWrapper;
import org.springblade.modules.tenantpool.entity.TenantpoolEntity;
import org.springblade.modules.tenantpool.vo.TenantpoolVO;

import java.util.List;

/**
 * 租客池表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class TenantpoolWrapper extends BaseEntityWrapper<TenantpoolEntity, TenantpoolVO> {

	private static ITenantFollowupService tenantFollowupService;

	static {
		tenantFollowupService = SpringUtil.getBean(ITenantFollowupService.class);
	}

	public static TenantpoolWrapper build() {
		return new TenantpoolWrapper();
	}


	public TenantpoolVO entityVO(TenantpoolEntity tenantpool) {
		TenantpoolVO tenantpoolVO = BeanUtil.copy(tenantpool, TenantpoolVO.class);
		tenantpoolVO.setGenderValue(DictBizCache.getValue(DictBizEnum.GENDER, tenantpool.getGender()));
		tenantpoolVO.setDemandTypeValue(DictBizCache.getValue(DictBizEnum.DEMAND_TYPE, tenantpool.getGender()));
		tenantpoolVO.setCustomerSourceValue(DictBizCache.getValue(DictBizEnum.TENANTPOOL_CUSTOMER_SOURCE, tenantpool.getCustomerSource()));
		tenantpoolVO.setTenantTypeValue(DictBizCache.getValue(DictBizEnum.TENANTPOOL_CUSTOMER_SOURCE, tenantpool.getGender()));
		tenantpoolVO.setPriceRangeValue(DictBizCache.getValue(DictBizEnum.TENANTPOOL_PRICE_RANGE, tenantpool.getGender()));
		tenantpoolVO.setStayPeriodValue(DictBizCache.getValue(DictBizEnum.TENANTPOOL_STAY_PERIOD, tenantpool.getGender()));
		tenantpoolVO.setUrgentDegreeValue(DictBizCache.getValue(DictBizEnum.TENANTPOOL_URGENT_DEGREE, tenantpool.getGender()));

		List<TenantFollowupEntity> tenantFollowupEntityList = tenantFollowupService.list(Wrappers.<TenantFollowupEntity>lambdaQuery().eq(TenantFollowupEntity::getTenantpoolId, tenantpool.getId()).orderByDesc(TenantFollowupEntity::getCreateTime));
		tenantpoolVO.setTenantFollowupVOList(TenantFollowupWrapper.build().listVO(tenantFollowupEntityList));


		//tenantpoolVO.set(DictCache.getValue(DictBizEnum.TENANTPOOL_URGENT_DEGREE.getName(), tenantpool.getGender()));
		//User createUser = UserCache.getUser(tenantpool.getCreateUser());
		//User updateUser = UserCache.getUser(tenantpool.getUpdateUser());
		//tenantpoolVO.setCreateUserName(createUser.getName());
		//tenantpoolVO.setUpdateUserName(updateUser.getName());

		return tenantpoolVO;
	}

}
