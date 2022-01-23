package com.secjong.instagramclone.rental.dto;

public class RentalDto {
    private String libraryId;
    private String bookId;
    private String client;
    private String returnYn;

    public RentalDto() {
    }

    public RentalDto(String libraryId, String bookId, String client, String returnYn) {
        this.libraryId = libraryId;
        this.bookId = bookId;
        this.client = client;
        this.returnYn = returnYn;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getClient() {
        return client;
    }

    public String getReturnYn() {
        return returnYn;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setReturnYn(String returnYn) {
        this.returnYn = returnYn;
    }
}
