package com.pisoplaza.repository;
import com.pisoplaza.model.Cobro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CobroRepository extends JpaRepository<Cobro, Integer> {
    List<Cobro> findByComercianteId(Integer comercianteId);
}
