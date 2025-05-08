package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "municipio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_municipio")
    private Long codigoMunicipio;

    @Column(nullable = false)
    private String nombre;
}
