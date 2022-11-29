package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.Drug;
import com.example.webproject.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/get")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/search")
    public Result selectDrug(@RequestParam("searchKey")String searchValue){
        List<Drug> search = searchService.search(searchValue);
        return Result.ok(search);
    }
}
