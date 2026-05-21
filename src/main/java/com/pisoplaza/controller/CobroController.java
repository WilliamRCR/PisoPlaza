package com.pisoplaza.controller;

import com.pisoplaza.model.AsignacionEspacio;
import com.pisoplaza.model.Cobro;
import com.pisoplaza.service.CobroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cobros")
@RequiredArgsConstructor
public class CobroController {
    private final CobroService service;

    @GetMapping
    public List<Cobro> getAll() {return service.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Cobro> getById(@PathVariable Integer id) {return ResponseEntity.ok(service.findById(id));}

    @PostMapping
    public ResponseEntity<Cobro> create(@RequestBody Cobro cobro) {return ResponseEntity.ok(service.save(cobro));}

    @PutMapping("/{id}")
    public ResponseEntity<Cobro> update(@PathVariable Integer id, @RequestBody Cobro cobro){
        return ResponseEntity.ok(service.update(id, cobro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
