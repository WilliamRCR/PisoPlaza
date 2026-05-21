package com.pisoplaza.service;

import com.pisoplaza.model.Espacio;
import com.pisoplaza.repository.EspacioRepository;
import com.pisoplaza.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspacioService {
    private final EspacioRepository repo;
    public List<Espacio> findAll() {return repo.findAll();}
    public Espacio findById(Integer id) {return repo.findById(id).orElseThrow();}
    public Espacio save(Espacio espacio){return repo.save(espacio);}
    public Espacio update(Integer id, Espacio espacio){
        Espacio existing = findById(id);
        existing.setDescripcion(espacio.getDescripcion());
        existing.setEstado(espacio.getEstado());
        return repo.save(existing);
    }
    public void delete(Integer id){repo.deleteById(id);}
}
