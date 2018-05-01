package com.eb.pcshop.manager.service.impl;

import com.eb.pcshop.manager.dao.AdminManMapper;
import com.eb.pcshop.manager.dao.UserMapper;
import com.eb.pcshop.manager.pojo.dto.Page;
import com.eb.pcshop.manager.pojo.po.AdminMan;
import com.eb.pcshop.manager.pojo.po.User;
import com.eb.pcshop.manager.pojo.po.UserExample;
import com.eb.pcshop.manager.pojo.vo.UserQuery;
import com.eb.pcshop.manager.serviceInterface.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    //即将使用logback的日志，成员变量
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AdminManMapper adminManMapper;

    @Autowired
    private UserMapper userMapper;

    //更新管理员信�?
    @Override
    public int editAdmin(AdminMan adm) {
        return adminManMapper.editAdmin(adm);
    }

    //登录验证
    @Override
    public AdminMan selectAdmin(AdminMan admin) {
        return adminManMapper.selectAdmin(admin);
    }

    //满足搜索条件的用户数
    @Override
    public long countUser(UserQuery query) {
        return adminManMapper.countUser(query);
    }

    //搜索满足条件的用户数�?
    @Override
    public List<User> listUserByPage(Page page, UserQuery query) {
        List<User> list =  adminManMapper.listUserByPage(page, query);
        return list;
    }

    //查看更改后的管理员数�?
    @Override
    public AdminMan findAdmin() {
        return adminManMapper.findAdmin();
    }

    //更改用户的账户状�?
    @Override
    public Integer updatePflagByUid(Integer uid) {
        User user = adminManMapper.selectUserByUid(uid);
        return adminManMapper.updatePflagByUid(user);
    }

    //根据UID更改用户的vip属�??
    @Override
    public Integer updateVipByUid(Integer uid) {
        User user = adminManMapper.selectUserByUid(uid);
        return adminManMapper.updateVipByUid(user);
    }

    //删除用户
    @Override
    public Integer removeUser(Integer uid) {
        return adminManMapper.removeUser(uid);
    }

    //批量删除
    @Override
    public Integer removeBatchUser(List<Integer> list) {
        Integer i = 0;
        try {
            User user = new User();
            user.setStatue("0");
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUidIn(list);
            i = userMapper.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    //根据UID查询用户信息
    @Override
    public User selectUserByUid(Integer uid) {
        return adminManMapper.selectUserByUid(uid);
    }

    //添加用户
    @Override
    public Integer addUser(User user) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String registertime = sdf.format(new Date());
        user.setRegistertime(registertime);

        Integer c =  adminManMapper.addUser(user);
        return c ;
    }

    //编辑用户
    @Override
    public Integer editUser(User user) {
        System.out.println("进入到实现类�?===="+user);
        //return userMapper.updateByPrimaryKey(user);

        return adminManMapper.editUser(user);
    }
}
