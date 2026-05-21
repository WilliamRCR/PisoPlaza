package com.pisoplaza.service;

import com.pisoplaza.model.TipoCobro;
import com.pisoplaza.repository.TipoCobroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoCobroService {
    private final TipoCobroRepository repo;
    public List<TipoCobro> findAll() {return repo.findAll();}
    public TipoCobro findById(Integer id) {return repo.findById(id).orElseThrow();}
    public TipoCobro save(TipoCobro tc) {return repo.save(tc);}
}
