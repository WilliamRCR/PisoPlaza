package com.pisoplaza.controller;

import com.pisoplaza.model.AsignacionEspacio;
import com.pisoplaza.model.Comerciante;
import com.pisoplaza.service.ComercianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comerciantes")
@RequiredArgsConstructor
public class ComercianteController {
    private final ComercianteService service;
    @GetMapping
    public List<Comerciante> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Comerciante> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<Comerciante> create(@RequestBody Comerciante comerciante) {return ResponseEntity.ok(service.save(comerciante));}

    @PutMapping("/{id}")
    public ResponseEntity<Comerciante> update(@PathVariable Integer id, @RequestBody Comerciante comerciante){
        return ResponseEntity.ok(service.update(id, comerciante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
