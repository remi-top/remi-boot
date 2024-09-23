package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.GroupUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 组织用户(GroupUser)数据层
 */
@Mapper
public interface GroupUserMapper extends BaseMapper<GroupUser> {

}
