package com.pisoplaza.controller;

import com.pisoplaza.model.Comprobante;
import com.pisoplaza.model.TipoComerciante;
import com.pisoplaza.service.TipoComercianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipocomerciantes")
@RequiredArgsConstructor
public class TipoComercianteController {
    private final TipoComercianteService service;
    @GetMapping
    public List<TipoComerciante> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<TipoComerciante> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<TipoComerciante> create(@RequestBody TipoComerciante tipoComerciante) {return ResponseEntity.ok(service.save(tipoComerciante));}

}
