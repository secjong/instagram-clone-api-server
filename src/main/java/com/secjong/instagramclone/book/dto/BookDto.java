package com.secjong.instagramclone.book.dto;

public class BookDto {
    private String id;
    private String isbn;
    private String name;
    private String author;
    private int rentalFee;
    private String categoryId;

    public BookDto() {
    }

    public BookDto(String id, String isbn, String name, String author, int rentalFee, String categoryId) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.rentalFee = rentalFee;
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getRentalFee() {
        return rentalFee;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRentalFee(int rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
