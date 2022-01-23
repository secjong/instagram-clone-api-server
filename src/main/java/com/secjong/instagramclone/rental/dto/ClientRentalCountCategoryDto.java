package com.secjong.instagramclone.rental.dto;

public class ClientRentalCountCategoryDto {
    private String client;
    private String categoryId;
    private String categoryName;
    private int count;

    public ClientRentalCountCategoryDto() {
    }

    public ClientRentalCountCategoryDto(String client, String categoryId, String categoryName, int count) {
        this.client = client;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.count = count;
    }

    public String getClient() {
        return client;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCount() {
        return count;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
