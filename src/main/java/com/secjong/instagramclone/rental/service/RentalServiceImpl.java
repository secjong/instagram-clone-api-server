package com.secjong.instagramclone.rental.service;

import com.secjong.instagramclone.rental.dao.RentalDao;
import com.secjong.instagramclone.rental.dto.ClientRentalCountCategoryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountLibraryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountRankDto;
import com.secjong.instagramclone.rental.dto.RentalRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalDao rentalDao;

    @Override
    public List<ClientRentalCountRankDto> getClientRentalCountRank() {
        return rentalDao.selectClientRentalCountRank();
    }

    @Override
    public List<ClientRentalCountCategoryDto> getClientRentalCountCategory() {
        return rentalDao.selectClientRentalCountCategory();
    }

    @Override
    public List<ClientRentalCountLibraryDto> getClientRentalCountLibrary() {
        return rentalDao.selectClientRentalCountLibrary();
    }

    @Override
    public int rentalBook(List<RentalRequestDto> rentalRequestDtoList) {
        /*
          1. book_library_status 에서 remain_count 감소
          2. book_rental_history 에 return_yn 'N' 으로 대여이력 삽입
          3. book 에서 book_id 로 rental_fee 조회해서 sum
        * */
        int rentalFeeSum = 0;
        for (int i = 0; i < rentalRequestDtoList.size(); i++) {
            RentalRequestDto rentalRequestDto = rentalRequestDtoList.get(i);
            rentalDao.updateBookLibraryStatus(rentalRequestDto);
            rentalDao.insertBookRentalHistory(rentalRequestDto);
            rentalFeeSum += rentalDao.selectRentalFee(rentalRequestDto.getBookId());
        }
        return rentalFeeSum;
    }
}
