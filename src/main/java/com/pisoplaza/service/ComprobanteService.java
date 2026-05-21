package com.pisoplaza.service;

import com.pisoplaza.model.Comprobante;
import com.pisoplaza.repository.ComprobanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComprobanteService {
    private final ComprobanteRepository repo;
    public List<Comprobante> findAll() {return repo.findAll();}
    public Comprobante findById(Integer id) {return repo.findById(id).orElseThrow();}
    public Comprobante save(Comprobante comprobante) {return repo.save(comprobante);}

}
