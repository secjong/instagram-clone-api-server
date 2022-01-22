package com.secjong.instagramclone.category.dao;

import com.secjong.instagramclone.category.dto.CategoryBookRemainCountDto;
import com.secjong.instagramclone.category.dto.CategoryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // mapping xml 파일에 있는 sql을 인터페이스로 호출하도록 설정
public interface CategoryDao {
    public List<CategoryDto> selectCategoryList ();

    public List<CategoryBookRemainCountDto> selectBookRemainCountGroupByCategory ();
}
