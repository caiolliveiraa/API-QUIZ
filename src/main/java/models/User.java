package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.example.demo.model.Endereco;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String email;
    private String senha;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rank_place", referencedColumnName = "place")
    private Ranking place;



}
