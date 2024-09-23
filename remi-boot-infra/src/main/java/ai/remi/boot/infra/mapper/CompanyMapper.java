package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 公司表(Company)数据层
 */
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

}
