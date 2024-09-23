package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.AppPublish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 应用发布表(AppPublish)数据层
 */
@Mapper
public interface AppPublishMapper extends BaseMapper<AppPublish> {

}
