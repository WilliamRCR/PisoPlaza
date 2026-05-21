package com.pisoplaza.repository;

import com.pisoplaza.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
    Optional<Comprobante> findByCobroId(Integer cobroId);
}
