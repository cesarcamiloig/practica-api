package com.example.demo.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "colegio_id")
    private Colegio colegio;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id")
    private TipoDocumento tipoDocumento;

    @OneToMany(mappedBy = "participante")
    private List<Inscripcion> inscripciones;

    @OneToMany(mappedBy = "participante")
    private List<Asistente> asistencias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
