package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.CordRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 组织角色表(CordRole)数据层
 */
@Mapper
public interface CordRoleMapper extends BaseMapper<CordRole> {

}
