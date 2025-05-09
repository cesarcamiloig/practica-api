package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.TipoDocumento;


public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {
}
