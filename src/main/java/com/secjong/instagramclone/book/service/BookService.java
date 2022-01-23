package com.secjong.instagramclone.book.service;

import com.secjong.instagramclone.book.dto.LibraryRemainRentalCountDto;

import java.util.List;

public interface BookService {

    public List<LibraryRemainRentalCountDto> getLibraryRemainRentalByBookName (String bookName);
}
