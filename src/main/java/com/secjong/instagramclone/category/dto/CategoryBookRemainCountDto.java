package com.secjong.instagramclone.category.dto;

public class CategoryBookRemainCountDto {
    private String categoryId;
    private String categoryName;
    private int bookRemains;

    public CategoryBookRemainCountDto() {
    }

    public CategoryBookRemainCountDto(String categoryId, String categoryName, int bookRemains) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.bookRemains = bookRemains;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getBookRemains() {
        return bookRemains;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setBookRemains(int bookRemains) {
        this.bookRemains = bookRemains;
    }
}
