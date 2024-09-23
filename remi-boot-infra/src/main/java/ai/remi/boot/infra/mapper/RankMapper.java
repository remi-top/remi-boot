package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.Rank;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 职级表(Rank)数据层
 */
@Mapper
public interface RankMapper extends BaseMapper<Rank> {

}
