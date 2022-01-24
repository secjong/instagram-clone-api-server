package com.secjong.instagramclone.rental.controller;

import com.secjong.instagramclone.rental.dto.ClientRentalCountCategoryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountLibraryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountRankDto;
import com.secjong.instagramclone.rental.dto.RentalRequestDto;
import com.secjong.instagramclone.rental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/rental")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @GetMapping("/client/count")
    public ResponseEntity getClientRentalCountRank () {
        List<ClientRentalCountRankDto> list = rentalService.getClientRentalCountRank();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/client/category/count")
    public ResponseEntity getClientRentalCountCategory () {
        List<ClientRentalCountCategoryDto> list = rentalService.getClientRentalCountCategory();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/client/library/count")
    public ResponseEntity getClientRentalCountLibrary () {
        List<ClientRentalCountLibraryDto> list = rentalService.getClientRentalCountLibrary();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity rentalBook (@RequestBody(required = true) List<RentalRequestDto> list) {
//        list.stream().forEach(item -> System.out.println(item.getBookId()));
        int rentalFeeSum = rentalService.rentalBook(list);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("rentalFeeSum", rentalFeeSum);
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
