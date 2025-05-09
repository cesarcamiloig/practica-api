package com.example.demo.model;

import java.sql.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String observación;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "sesion_id")
    private Sesion sesion;
}
