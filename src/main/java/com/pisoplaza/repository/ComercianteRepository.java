package com.pisoplaza.repository;

import com.pisoplaza.model.Comerciante;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ComercianteRepository extends JpaRepository<Comerciante, Integer> {
    List<Comerciante> findByActivoTrue();
}
