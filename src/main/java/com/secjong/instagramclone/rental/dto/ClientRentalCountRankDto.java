package com.secjong.instagramclone.rental.dto;

public class ClientRentalCountRankDto {
    private int rank;
    private int count;
    private String client;

    public ClientRentalCountRankDto() {
    }

    public ClientRentalCountRankDto(int rank, int count, String client) {
        this.rank = rank;
        this.count = count;
        this.client = client;
    }

    public int getRank() {
        return rank;
    }

    public int getCount() {
        return count;
    }

    public String getClient() {
        return client;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
