package com.secjong.instagramclone.rental.dto;

public class RentalRequestDto {
    private String client;
    private String libraryId;
    private String bookId;

    public RentalRequestDto() {
    }

    public RentalRequestDto(String client, String libraryId, String bookId) {
        this.client = client;
        this.libraryId = libraryId;
        this.bookId = bookId;
    }

    public String getClient() {
        return client;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
