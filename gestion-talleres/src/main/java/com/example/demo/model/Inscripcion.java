package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "inscripcion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "participante", nullable = false)
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "programacion", nullable = false)
    private Programacion programacion;

    @Column(nullable = false)
    private LocalDate fecha;
}
