package models.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import models.models.Question;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String category;
    @OneToMany(mappedBy = "category")
    private List<Question> questions;
}
