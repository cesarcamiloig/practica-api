package com.example.demo.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripción;

    @OneToMany(mappedBy = "taller")
    private List<Programacion> programaciones;
}
