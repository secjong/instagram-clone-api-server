package com.secjong.instagramclone.book.service;

import com.secjong.instagramclone.book.dao.BookDao;
import com.secjong.instagramclone.book.dto.LibraryRemainRentalCountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<LibraryRemainRentalCountDto> getLibraryRemainRentalByBookName(String bookName) {
        return bookDao.selectLibraryRemainRentalCount(bookName);
    }
}
