package com.example.webproject.mapper;

import com.example.webproject.dto.LoginRequest;
import com.example.webproject.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface UserMapper extends BaseMapper<User> {

//    User  update(String name,String email, String address, String birth);

}
