package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "colegio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Colegio {

    @Id
    @Column(name = "codigo_dane")
    private String codigoDane;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigo_municipio", nullable = false)
    private Municipio municipio;
}
