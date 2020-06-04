package pers.huidong.shiro.service;

import pers.huidong.shiro.model.User;

/**
 * @program: shiro
 * @auther: HuiDong
 * @date: 2020/6/4 11:22
 * @description:
 */
public interface UserService {
    User findByUsername(String username);
}
