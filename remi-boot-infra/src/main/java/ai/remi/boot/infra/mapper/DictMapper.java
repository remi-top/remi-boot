package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 字典主表(Dict)数据层
 */
@Mapper
public interface DictMapper extends BaseMapper<Dict> {

}
