package com.example.apiquiz.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long place;
    private int points;

    @OneToMany(mappedBy = "ranking")
    private List<User> UserRank;



}
