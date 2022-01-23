package com.secjong.instagramclone.rental.service;

import com.secjong.instagramclone.rental.dto.ClientRentalCountCategoryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountLibraryDto;
import com.secjong.instagramclone.rental.dto.ClientRentalCountRankDto;
import com.secjong.instagramclone.rental.dto.RentalRequestDto;

import java.util.List;

public interface RentalService {
    public List<ClientRentalCountRankDto> getClientRentalCountRank();
    public List<ClientRentalCountCategoryDto> getClientRentalCountCategory();
    public List<ClientRentalCountLibraryDto> getClientRentalCountLibrary();
    public int rentalBook(List<RentalRequestDto> rentalRequestDtoList);
}
