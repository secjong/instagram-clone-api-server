package com.secjong.instagramclone.category.controller;

import com.secjong.instagramclone.category.dto.CategoryBookRemainCountDto;
import com.secjong.instagramclone.category.dto.CategoryDto;
import com.secjong.instagramclone.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "")
    public ResponseEntity<List<CategoryDto>> getCategory () {
        List<CategoryDto> categoryDtoList = categoryService.getCategory();
        return new ResponseEntity<>(categoryDtoList, HttpStatus.OK);
    }

    @GetMapping(value = "/books/remains")
    public ResponseEntity<List<CategoryBookRemainCountDto>> getBookRemainCountGroupByCategory () {
        List<CategoryBookRemainCountDto> list = categoryService.getBookRemainCountGroupByCategory();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
