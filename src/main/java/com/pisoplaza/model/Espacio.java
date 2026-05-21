package com.pisoplaza.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "Espacio")
@Data @NoArgsConstructor @AllArgsConstructor
public class Espacio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 20, columnDefinition = "VARCHAR(20) DEFAULT 'DISPONIBLE'")
    private String estado = "DISPONIBLE";
}
