package models.models;
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
    String level[]= {"Facil","Medio","Dificil"};


}
