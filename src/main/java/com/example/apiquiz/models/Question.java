package com.example.apiquiz.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String question;

    @OneToOne(cascade = CascadeType.ALL)
    private Answer answer;

    private int point;

    @ManyToOne
    private Category category;

}



