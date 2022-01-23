package com.secjong.instagramclone.rental.dao;

import com.secjong.instagramclone.rental.dto.ClientRentalCountCategoryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountLibraryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountRankDto;
import com.secjong.instagramclone.rental.dto.RentalRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RentalDao {
    public List<ClientRentalCountRankDto> selectClientRentalCountRank();
    public List<ClientRentalCountCategoryDto> selectClientRentalCountCategory();
    public List<ClientRentalCountLibraryDto> selectClientRentalCountLibrary();
    public void updateBookLibraryStatus(RentalRequestDto rentalRequestDto);
    public void insertBookRentalHistory(RentalRequestDto rentalRequestDto);
    public int selectRentalFee(String bookId);
}
