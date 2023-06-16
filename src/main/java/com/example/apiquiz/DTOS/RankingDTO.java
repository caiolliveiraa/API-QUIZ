package com.example.apiquiz.DTOS;


import java.util.List;

public class RankingDTO {
    private long place;
    private int points;
    private List<UserDTO> userRank;


    public RankingDTO() {
    }

    public RankingDTO(long place, int points, List<UserDTO> userRank) {
        this.place = place;
        this.points = points;
        this.userRank = userRank;
    }

    public long getPlace() {
        return place;
    }

    public void setPlace(long place) {
        this.place = place;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<UserDTO> getUserRank() {
        return userRank;
    }

    public void setUserRank(List<UserDTO> userRank) {
        this.userRank = userRank;
    }
}
