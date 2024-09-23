package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 用户角色表(UserRole)数据层
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}
