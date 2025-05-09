package com.example.demo.controller;

import com.example.demo.model.TipoDocumento;
import com.example.demo.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/tipo-documento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping
    public List<TipoDocumento> findAll() {
        return tipoDocumentoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoDocumento> findById(@PathVariable Integer id) {
        return tipoDocumentoService.findById(id);
    }

    @PostMapping
    public TipoDocumento save(@RequestBody TipoDocumento tipoDocumento) {
        return tipoDocumentoService.save(tipoDocumento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        tipoDocumentoService.deleteById(id);
    }
}