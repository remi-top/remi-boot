package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.Grade;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 职系表(Grade)数据层
 */
@Mapper
public interface GradeMapper extends BaseMapper<Grade> {

}
