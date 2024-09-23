package ai.remi.boot.server.service.impl;

import ai.remi.boot.domain.entity.PostRole;
import ai.remi.boot.infra.mapper.PostRoleMapper;
import ai.remi.boot.server.service.PostRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 职位角色表(PostRole)服务实现层
 */
@Service("postRoleService")
public class PostRoleServiceImpl extends ServiceImpl<PostRoleMapper, PostRole> implements PostRoleService {

}

