package ai.remi.boot.server.service.impl;

import ai.remi.boot.domain.entity.Dept;
import ai.remi.boot.infra.mapper.DeptMapper;
import ai.remi.boot.server.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 部门表(Dept)服务实现层
 */
@Service("deptService")
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}

