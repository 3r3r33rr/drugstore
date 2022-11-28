package com.example.webproject.mapper;

import com.example.webproject.entity.Drug;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.webproject.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@Mapper
public interface DrugMapper extends BaseMapper<Drug> {

    List<Drug> list();
}
