package com.pisoplaza.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "TipoComerciante")
@Data @NoArgsConstructor @AllArgsConstructor
public class TipoComerciante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 20)
    private String nombre;
}
