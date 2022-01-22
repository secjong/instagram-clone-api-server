package com.secjong.instagramclone.category.service;

import com.secjong.instagramclone.category.dao.CategoryDao;
import com.secjong.instagramclone.category.dto.CategoryBookRemainCountDto;
import com.secjong.instagramclone.category.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<CategoryDto> getCategory() {
        return categoryDao.selectCategoryList();
    }

    @Override
    public List<CategoryBookRemainCountDto> getBookRemainCountGroupByCategory() {
        return categoryDao.selectBookRemainCountGroupByCategory();
    }
}
