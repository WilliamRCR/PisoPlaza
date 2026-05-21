package com.pisoplaza.service;

import com.pisoplaza.model.TipoCobro;
import com.pisoplaza.model.TipoComerciante;
import com.pisoplaza.repository.TipoComercianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoComercianteService {
    private final TipoComercianteRepository repo;
    public List<TipoComerciante> findAll() {return repo.findAll();}
    public TipoComerciante findById(Integer id){ return repo.findById(id).orElseThrow();}
    public TipoComerciante save(TipoComerciante tipoc) {return repo.save(tipoc);}

}
