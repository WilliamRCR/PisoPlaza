package com.pisoplaza.controller;

import com.pisoplaza.model.Espacio;
import com.pisoplaza.service.EspacioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/espacios")
@RequiredArgsConstructor
public class EspacioController {
    private final EspacioService service;
    @GetMapping
    public List<Espacio> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Espacio> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<Espacio> create(@RequestBody Espacio espacio) {return ResponseEntity.ok(service.save(espacio));}

    @PutMapping("/{id}")
    public ResponseEntity<Espacio> update(@PathVariable Integer id, @RequestBody Espacio espacio){
        return ResponseEntity.ok(service.update(id, espacio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
