package pers.huidong.shiro.service;

import org.springframework.stereotype.Service;
import pers.huidong.shiro.mapper.UserMapper;
import pers.huidong.shiro.model.User;

import javax.annotation.Resource;

/**
 * @program: shiro
 * @auther: HuiDong
 * @date: 2020/6/4 11:23
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
