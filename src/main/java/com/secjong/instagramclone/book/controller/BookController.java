package com.secjong.instagramclone.book.controller;

import com.secjong.instagramclone.book.dto.LibraryRemainRentalCountDto;
import com.secjong.instagramclone.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/library/count")
    public ResponseEntity<List<LibraryRemainRentalCountDto>> getLibraryRemainRentalByBookName (@RequestParam(name = "bookName", required = true) String bookName) {
        List<LibraryRemainRentalCountDto> list = bookService.getLibraryRemainRentalByBookName(bookName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
