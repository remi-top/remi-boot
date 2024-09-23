package ai.remi.boot.server.service.impl;

import ai.remi.boot.domain.entity.RoleMenu;
import ai.remi.boot.infra.mapper.RoleMenuMapper;
import ai.remi.boot.server.service.RoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 角色菜单表(RoleMenu)服务实现层
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuService {

}

