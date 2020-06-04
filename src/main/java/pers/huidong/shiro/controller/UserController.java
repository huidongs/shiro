package pers.huidong.shiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.huidong.shiro.model.User;
import pers.huidong.shiro.service.UserService;

/**
 * @program: shiro
 * @auther: HuiDong
 * @date: 2020/6/4 17:43
 * @description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findbyusername")
    public String findByUsername(String username, Model model){
        model.addAttribute("user",userService.findByUsername(username));
        return "/success";
    }
}
