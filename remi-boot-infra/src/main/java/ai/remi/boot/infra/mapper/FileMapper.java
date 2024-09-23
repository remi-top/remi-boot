package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.File;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 文件管理(File)数据层
 */
@Mapper
public interface FileMapper extends BaseMapper<File> {

}
