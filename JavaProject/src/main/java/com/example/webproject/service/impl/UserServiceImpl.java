package com.example.webproject.service.impl;

import com.example.webproject.dto.LoginRequest;
import com.example.webproject.dto.Result;
import com.example.webproject.entity.User;
import com.example.webproject.mapper.UserMapper;
import com.example.webproject.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;



    @Override
    public Result getAllUsers() {
        List<User> list = list();
        if(list==null||list.isEmpty()){
            return Result.fail("当前无用户!");
        }else {
            return Result.ok(list);
        }
    }



   @Override
    public Result register(User user){
       boolean save = save(user);
       if(save){
        return Result.ok("注册成功!");
       }else{
           return Result.fail("注册失败");
       }
   }

    @Override
    public Result login(LoginRequest request) {
        User one = query().eq("db_username", request.getName()).eq("db_pwd",request.getPwd()).one();
        if(one==null){
            return Result.fail("账号或密码错误");
        }else{
            return Result.ok(one);
        }
    }
}