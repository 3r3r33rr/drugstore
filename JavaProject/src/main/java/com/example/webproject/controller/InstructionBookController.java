package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.InstructionBook;
import com.example.webproject.entity.User;
import com.example.webproject.service.InstructionBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/instruction-book")
public class InstructionBookController {

    @Autowired
    private InstructionBookService instructionBookService;

    @GetMapping("/getall")
//    public Result getAll(){
//        return  instructionBookService.getAll();
//    }
    public Result getAllUser(){
        List<InstructionBook> list = instructionBookService.getAllInBook();
        return Result.ok(list);
    }
}
