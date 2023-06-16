package com.example.apiquiz.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Level {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String level;

public Level(String level) {
        this.level = level;
        }
        }
