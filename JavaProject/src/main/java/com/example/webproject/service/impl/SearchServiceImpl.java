package com.example.webproject.service.impl;

import com.example.webproject.entity.Drug;
import com.example.webproject.mapper.SearchMapper;
import com.example.webproject.service.SearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SearchMapper searchMapper;


    @Override
    public List<Drug> search(String val) {
        List<Drug> searchDrug = searchMapper.search(val);
        return searchDrug;
    }
}
