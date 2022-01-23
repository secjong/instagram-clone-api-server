package com.secjong.instagramclone.book.dao;

import com.secjong.instagramclone.book.dto.LibraryRemainRentalCountDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    public List<LibraryRemainRentalCountDto> selectLibraryRemainRentalCount (String bookName);
}
