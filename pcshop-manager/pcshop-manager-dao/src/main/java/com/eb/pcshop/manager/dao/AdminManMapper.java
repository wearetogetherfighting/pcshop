package com.eb.pcshop.manager.dao;

import com.eb.pcshop.manager.pojo.po.AdminMan;
import com.eb.pcshop.manager.pojo.po.User;
import com.eb.pcshop.manager.pojo.dto.Page;
import com.eb.pcshop.manager.pojo.vo.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminManMapper {

    //管理员登�?
    AdminMan selectAdmin(AdminMan admin);

    //更新管理员信�?
    int editAdmin(@Param("adm") AdminMan adm);

    //满足搜索条件的用户数
    long countUser(@Param("query") UserQuery query);

    //搜索满足条件的用户数�?
    List<User> listUserByPage(@Param("page") Page page, @Param("query") UserQuery query);

    //查看更改后的管理员数�?
    AdminMan findAdmin();

    //根据UID查询用户信息
    User selectUserByUid(@Param("uid") Integer uid);

    //更改用户的账户状�?
    Integer updatePflagByUid(@Param("user") User user);

    //根据UID更改用户的vip属�??
    Integer updateVipByUid(@Param("user") User user);

    //删除用户
    Integer removeUser(Integer uid);

    //批量删除
    Integer removeBatchUser(List<Integer> list);

    //根据UID查询用户信息
    User selectUserByuid(Integer uid);

    //添加用户
    Integer addUser(@Param("u") User user);

    //编辑用户
    Integer editUser(@Param("u") User user);
}