package com.secjong.instagramclone.category.service;

import com.secjong.instagramclone.category.dto.CategoryBookRemainCountDto;
import com.secjong.instagramclone.category.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    public List<CategoryDto> getCategory ();

    public List<CategoryBookRemainCountDto> getBookRemainCountGroupByCategory (String libraryId);
}
