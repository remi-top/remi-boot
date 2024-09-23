package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 省市县表(Area)数据层
 */
@Mapper
public interface AreaMapper extends BaseMapper<Area> {

}
