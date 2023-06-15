package models.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.example.demo.model.Endereco;

import jakarta.persistence.*;
import models.models.Question;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String answer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question question;
}
