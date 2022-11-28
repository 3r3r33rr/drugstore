package com.example.webproject.service;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.InstructionBook;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.webproject.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
public interface InstructionBookService extends IService<InstructionBook> {

//    Result getAll();
    List<InstructionBook> getAllInBook();
}
