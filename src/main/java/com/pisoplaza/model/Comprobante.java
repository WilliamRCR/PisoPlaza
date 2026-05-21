package com.pisoplaza.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "Comprobante")
@Data @NoArgsConstructor @AllArgsConstructor
public class Comprobante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "cobro_id", nullable = false, unique = true)
    private Cobro cobro;

    @Column(name = "codigo_qr", length = 255)
    private String codigoQr;

    @Column(columnDefinition = "DATETIME DEFAULT GETDATE()")
    private LocalDateTime fecha;

    @PrePersist
    public void prePersist() {
        if (fecha == null) fecha = LocalDateTime.now();
    }
}
