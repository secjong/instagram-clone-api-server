package com.secjong.instagramclone.rental.dto;

public class ClientRentalCountLibraryDto {
    private String client;
    private String libraryId;
    private String libraryName;
    private int count;

    public ClientRentalCountLibraryDto() {
    }

    public ClientRentalCountLibraryDto(String client, String libraryId, String libraryName, int count) {
        this.client = client;
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.count = count;
    }

    public String getClient() {
        return client;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public int getCount() {
        return count;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
