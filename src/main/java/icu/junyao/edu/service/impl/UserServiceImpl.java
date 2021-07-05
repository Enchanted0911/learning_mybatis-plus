package icu.junyao.edu.service.impl;

import icu.junyao.edu.entity.User;
import icu.junyao.edu.mapper.UserMapper;
import icu.junyao.edu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author junyao
 * @since 2021-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
