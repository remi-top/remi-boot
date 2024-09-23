package ai.remi.boot.infra.mapper;

import ai.remi.boot.domain.entity.CompanyDept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 公司部门表(CompanyDept)数据层
 */
@Mapper
public interface CompanyDeptMapper extends BaseMapper<CompanyDept> {

}
