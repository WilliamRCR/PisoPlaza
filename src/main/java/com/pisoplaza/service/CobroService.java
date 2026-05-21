package com.pisoplaza.service;

import com.pisoplaza.model.Cobro;
import com.pisoplaza.repository.CobroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CobroService {
    private final CobroRepository repo;
    public List<Cobro> findAll() {return repo.findAll();}
    public Cobro findById(Integer id) {return repo.findById(id).orElseThrow();}
    public Cobro save(Cobro cobro) {return repo.save(cobro);}
    public Cobro update (Integer id, Cobro cobro){
        Cobro existing = findById(id);
        existing.setComerciante(cobro.getComerciante());
        existing.setUsuario(cobro.getUsuario());
        existing.setTipoCobro(cobro.getTipoCobro());
        existing.setFecha(cobro.getFecha());
        existing.setMonto(cobro.getMonto());
        existing.setObservacion(cobro.getObservacion());
        return repo.save(existing);
    }
    public void delete(Integer id) {repo.deleteById(id);}

}
