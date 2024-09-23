package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.LogRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 日志记录表(LogRecord)数据层
 */
@Mapper
public interface LogRecordMapper extends BaseMapper<LogRecord> {

}
