package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.Drug;
import com.example.webproject.entity.User;
import com.example.webproject.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@CrossOrigin
@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    private  DrugService drugService;

//    @Resource
//    private DrugService drugService;

    @GetMapping("/getall")
    public Result getAllUser(){
        List<Drug> list = drugService.getAllDrug();
        return Result.ok(list);
    }
//    public Result getAllUser(){
//        List<User> list = DruService.getAllUsers();
//        return Result.ok(list);
////    public Result getAll(){
////        return drugService.getAll();
////    }

}
