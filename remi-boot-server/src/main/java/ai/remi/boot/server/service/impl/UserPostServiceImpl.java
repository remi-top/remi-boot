package ai.remi.boot.server.service.impl;

import ai.remi.boot.domain.entity.UserPost;
import ai.remi.boot.infra.mapper.UserPostMapper;
import ai.remi.boot.server.service.UserPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 用户岗位表(UserPost)服务实现层
 */
@Service("userPostService")
public class UserPostServiceImpl extends ServiceImpl<UserPostMapper, UserPost> implements UserPostService {

}

