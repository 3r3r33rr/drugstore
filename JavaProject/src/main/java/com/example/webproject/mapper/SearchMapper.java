package com.example.webproject.mapper;

import com.example.webproject.entity.Drug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchMapper {
    List<Drug> search(String searchValue);
}
