package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.PostRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 职位角色表(PostRole)数据层
 */
@Mapper
public interface PostRoleMapper extends BaseMapper<PostRole> {

}
