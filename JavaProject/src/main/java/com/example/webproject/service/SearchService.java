package com.example.webproject.service;

import com.example.webproject.entity.Drug;

import java.util.List;

public interface SearchService {
    List<Drug> search(String val);
}
