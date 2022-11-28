package com.example.webproject.controller;

import com.example.webproject.dto.LoginRequest;
import com.example.webproject.dto.Result;
import com.example.webproject.entity.User;
import com.example.webproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
//登录
@PostMapping("/login")
public Result login(@RequestBody LoginRequest request){

    return userService.login(request);
}
//注册
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        return userService.register(user);
    }

//返回全部信息
    @GetMapping("/list")
    public Result getAllUser() {
       return userService.getAllUsers();
    }
//修改用户信息
//    @GetMapping("gengxin")
//    public Result update(@Param("name") String name,
//                       @Param("email") String email,
//                       @Param("address") String address,
//                       @Param("birth") String birth){
//        return userService.update(name,email,address,birth);
//    }






}
