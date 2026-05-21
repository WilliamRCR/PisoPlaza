package com.pisoplaza.repository;

import com.pisoplaza.model.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface EspacioRepository extends JpaRepository<Espacio, Integer> {
    List<Espacio> findByEstado(String estado);
}
