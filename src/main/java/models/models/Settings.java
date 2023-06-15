package models.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Level level;
    private Category category;





}