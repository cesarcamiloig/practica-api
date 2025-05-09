package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "programacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Programacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "colegio", nullable = false)
    private Colegio colegio;

    @ManyToOne
    @JoinColumn(name = "taller", nullable = false)
    private Taller taller;

    @ManyToOne
    @JoinColumn(name = "instructor", nullable = false)
    private Instructor instructor;
}
