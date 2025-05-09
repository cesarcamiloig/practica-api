package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"sesion_id", "participante_id"}))
public class Asistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "sesion_id")
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;
}
