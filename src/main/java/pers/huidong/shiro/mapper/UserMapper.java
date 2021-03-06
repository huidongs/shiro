package pers.huidong.shiro.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pers.huidong.shiro.model.User;

/**
 * @program: shiro
 * @auther: HuiDong
 * @date: 2020/6/4 10:46
 * @description:
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findByUsername(@Param("username")String username);

}
