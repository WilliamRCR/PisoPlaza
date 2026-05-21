package com.pisoplaza.service;

import com.pisoplaza.model.Comerciante;
import com.pisoplaza.repository.ComercianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComercianteService {
    private final ComercianteRepository repo;
    public List<Comerciante> findAll() {return repo.findAll();}
    public Comerciante findById(Integer id) {return repo.findById(id).orElseThrow();}
    public Comerciante save(Comerciante comerciante) {return repo.save(comerciante);}
    public Comerciante update(Integer id, Comerciante comerciante){
        Comerciante existing =findById(id);
        existing.setNombre(comerciante.getNombre());
        existing.setTipo(comerciante.getTipo());
        existing.setActivo(comerciante.getActivo());
        return repo.save(existing);
    }
    public void delete (Integer id) {repo.deleteById(id);}
}
