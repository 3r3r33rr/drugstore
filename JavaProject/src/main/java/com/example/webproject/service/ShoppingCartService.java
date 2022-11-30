package com.example.webproject.service;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
public interface ShoppingCartService extends IService<ShoppingCart> {

    Result addCart(ShoppingCart shoppingCart);

    Result getAll();

    Result selectById(Integer userId);

    Result updateCart(ShoppingCart shoppingCart);

    Result deleteCart(Integer userid,Integer drugid);
}
