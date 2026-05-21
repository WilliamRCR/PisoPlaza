package com.pisoplaza.repository;

import com.pisoplaza.model.AsignacionEspacio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface AsignacionEspacioRepository extends JpaRepository<AsignacionEspacio, Integer> {
    List<AsignacionEspacio> findByActivoTrue();
    List<AsignacionEspacio> findByComercianteId(Integer comercianteId);
}
