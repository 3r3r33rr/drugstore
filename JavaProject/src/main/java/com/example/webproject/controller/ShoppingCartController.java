package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.ShoppingCart;
import com.example.webproject.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@CrossOrigin
@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Resource
    private ShoppingCartService service;

    @GetMapping("/list")
    public Result selectById(@RequestParam("userid")Integer userId){
        return service.selectById(userId);
    }


    @PostMapping("/addcart")
    public Result addCart(@RequestBody ShoppingCart shoppingCart){
        return service.addCart(shoppingCart);
    }

    @PostMapping("/amount")
    public Result updateCart(@RequestBody ShoppingCart shoppingCart){
        return service.updateCart(shoppingCart);
    }

    @GetMapping("/getall")
    public Result getAll(){
        return service.getAll();
    }

    @GetMapping("/delete")
    public Result deleteCart(@RequestParam("userid")Integer userid,@RequestParam("drugid")Integer drugid){
        return service.deleteCart(userid,drugid);
    }
}
