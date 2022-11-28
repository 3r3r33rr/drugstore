package com.example.webproject.service.impl;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.Drug;
import com.example.webproject.entity.User;
import com.example.webproject.mapper.DrugMapper;
import com.example.webproject.service.DrugService;
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
public class DrugServiceImpl extends ServiceImpl<DrugMapper, Drug> implements DrugService {

    @Autowired
    DrugMapper drugMapper;
//    @Override
//    public Result getAll() {
//        List<Drug> list = list();
//        return Result.ok(list);
//    }
@Override
public List<Drug> getAllDrug() {
    return drugMapper.list();
}
}
