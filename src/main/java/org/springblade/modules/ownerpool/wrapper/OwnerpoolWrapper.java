package org.springblade.modules.ownerpool.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;
import org.springblade.modules.ownerpool.vo.OwnerpoolVO;

/**
 * 业主池表 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class OwnerpoolWrapper extends BaseEntityWrapper<OwnerpoolEntity, OwnerpoolVO>  {

	public static OwnerpoolWrapper build() {
		return new OwnerpoolWrapper();
 	}

	@Override
	public OwnerpoolVO entityVO(OwnerpoolEntity ownerpool) {
		OwnerpoolVO ownerpoolVO = BeanUtil.copy(ownerpool, OwnerpoolVO.class);

		//User createUser = UserCache.getUser(ownerpool.getCreateUser());
		//User updateUser = UserCache.getUser(ownerpool.getUpdateUser());
		//ownerpoolVO.setCreateUserName(createUser.getName());
		//ownerpoolVO.setUpdateUserName(updateUser.getName());

		return ownerpoolVO;
	}

}
