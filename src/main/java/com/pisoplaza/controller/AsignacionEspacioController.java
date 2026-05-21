package com.pisoplaza.controller;

import com.pisoplaza.model.AsignacionEspacio;
import com.pisoplaza.model.Usuario;
import com.pisoplaza.service.AsignacionEspacioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaciones")
@RequiredArgsConstructor
public class AsignacionEspacioController {
    private final AsignacionEspacioService service;

    @GetMapping
    public List<AsignacionEspacio> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<AsignacionEspacio> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<AsignacionEspacio> create(@RequestBody AsignacionEspacio ae) {return ResponseEntity.ok(service.save(ae));}

    @PutMapping("/{id}")
    public ResponseEntity<AsignacionEspacio> update(@PathVariable Integer id, @RequestBody AsignacionEspacio ae){
        return ResponseEntity.ok(service.update(id, ae));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
