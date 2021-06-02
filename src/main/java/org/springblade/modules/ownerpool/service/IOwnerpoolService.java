package org.springblade.modules.ownerpool.service;

import org.springblade.core.mp.base.BaseService;
import org.springblade.modules.ownerpool.dto.OwnerpoolDTO;
import org.springblade.modules.ownerpool.entity.OwnerpoolEntity;
import org.springblade.modules.ownerpool.entity.OwnerpoolListingsDetailEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 *  服务类
 *
 * @author Chill
 */
public interface IOwnerpoolService extends BaseService<OwnerpoolEntity> {

	boolean appToSave(OwnerpoolDTO ownerpoolDTO);

}
