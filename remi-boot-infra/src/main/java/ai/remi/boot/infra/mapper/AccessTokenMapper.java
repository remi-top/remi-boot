package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.AccessToken;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 鉴权令牌表(AccessToken)数据层
 */
@Mapper
public interface AccessTokenMapper extends BaseMapper<AccessToken> {

}
