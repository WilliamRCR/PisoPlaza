package com.pisoplaza.controller;

import com.pisoplaza.model.Comprobante;
import com.pisoplaza.model.TipoCobro;
import com.pisoplaza.service.TipoCobroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipocobros")
@RequiredArgsConstructor
public class TipoCobroController {
    private final TipoCobroService service;

    @GetMapping
    public List<TipoCobro> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<TipoCobro> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<TipoCobro> create(@RequestBody TipoCobro tipoCobro) {return ResponseEntity.ok(service.save(tipoCobro));}
}
