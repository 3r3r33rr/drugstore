package com.example.webproject.service;

import com.example.webproject.dto.LoginRequest;
import com.example.webproject.dto.Result;
import com.example.webproject.entity.ShoppingCart;
import com.example.webproject.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
public interface UserService extends IService<User> {



   Result getAllUsers();


    Result register(User user);

    Result login(LoginRequest request);
    Result update(User user);


}
