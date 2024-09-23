package ai.remi.boot.server.service.impl;

import ai.remi.boot.domain.entity.GroupRole;
import ai.remi.boot.infra.mapper.GroupRoleMapper;
import ai.remi.boot.server.service.GroupRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 用户组角色表(GroupRole)服务实现层
 */
@Service("groupRoleService")
public class GroupRoleServiceImpl extends ServiceImpl<GroupRoleMapper, GroupRole> implements GroupRoleService {

}

