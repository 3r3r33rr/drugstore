package com.example.webproject.service.impl;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.InstructionBook;
import com.example.webproject.entity.User;
import com.example.webproject.mapper.InstructionBookMapper;
import com.example.webproject.service.InstructionBookService;
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
public class InstructionBookServiceImpl extends ServiceImpl<InstructionBookMapper, InstructionBook> implements InstructionBookService {

    @Autowired
    InstructionBookMapper instructionBookMapper;
//    @Override
//    public Result getAll() {
//        List<InstructionBook> list = list();
//        return Result.ok(list);
//    }
    @Override
    public List<InstructionBook> getAllInBook() {
    return instructionBookMapper.list();
}
}
