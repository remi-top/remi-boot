package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.GroupRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 用户组角色表(GroupRole)数据层
 */
@Mapper
public interface GroupRoleMapper extends BaseMapper<GroupRole> {

}
