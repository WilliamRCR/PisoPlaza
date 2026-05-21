package com.pisoplaza.controller;

import com.pisoplaza.model.Comprobante;
import com.pisoplaza.model.Usuario;
import com.pisoplaza.service.ComprobanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
@RequiredArgsConstructor
public class ComprobanteController {
    private final ComprobanteService service;
    @GetMapping
    public List<Comprobante> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Comprobante> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<Comprobante> create(@RequestBody Comprobante comprobante) {return ResponseEntity.ok(service.save(comprobante));}
}
