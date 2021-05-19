package org.springblade.modules.listings.service.impl;

import org.springblade.core.mp.base.BaseServiceImpl;
import org.springblade.modules.listings.entity.ListingsEntity;
import org.springblade.modules.listings.mapper.ListingsMapper;
import org.springblade.modules.listings.service.IListingsService;
import org.springframework.stereotype.Service;

/**
 * 房源信息表 服务实现类
 *
 * @author Chill
 */
@Service
public class ListingsServiceImpl extends BaseServiceImpl<ListingsMapper, ListingsEntity> implements IListingsService {

}
