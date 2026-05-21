package com.pisoplaza.service;

import com.pisoplaza.model.AsignacionEspacio;
import com.pisoplaza.repository.AsignacionEspacioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsignacionEspacioService {
    private final AsignacionEspacioRepository repo;
    public List<AsignacionEspacio> findAll() {return repo.findAll();}
    public AsignacionEspacio findById(Integer id) { return repo.findById(id).orElseThrow();}
    public AsignacionEspacio save(AsignacionEspacio ae){ return repo.save(ae);}
    public AsignacionEspacio update(Integer id, AsignacionEspacio ae){
        AsignacionEspacio existing = findById(id);
        existing.setComerciante(ae.getComerciante());
        existing.setEspacio(ae.getEspacio());
        existing.setFechaInicio(ae.getFechaInicio());
        existing.setFechaFin(ae.getFechaFin());
        existing.setActivo(ae.getActivo());
        return repo.save(existing);
    }
    public void delete(Integer id) { repo.deleteById(id);}
}
