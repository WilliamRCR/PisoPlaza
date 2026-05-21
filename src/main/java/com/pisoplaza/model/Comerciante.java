package com.pisoplaza.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "Comerciante")
@Data @NoArgsConstructor @AllArgsConstructor
public class Comerciante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "tipo_id", nullable = false)
    private TipoComerciante tipo;

    @Column(columnDefinition = "BIT DEFAULT 1")
    private Boolean activo = true;
}
