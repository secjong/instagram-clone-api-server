package com.secjong.instagramclone.book.dto;

public class LibraryRemainRentalCountDto {
    private String libraryId;
    private String libraryName;
    private int remainCount;
    private int rentalCount;

    public LibraryRemainRentalCountDto() {
    }

    public LibraryRemainRentalCountDto(String libraryId, String libraryName, int remainCount, int rentalCount) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.remainCount = remainCount;
        this.rentalCount = rentalCount;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public int getRemainCount() {
        return remainCount;
    }

    public int getRentalCount() {
        return rentalCount;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setRemainCount(int remainCount) {
        this.remainCount = remainCount;
    }

    public void setRentalCount(int rentalCount) {
        this.rentalCount = rentalCount;
    }
}
