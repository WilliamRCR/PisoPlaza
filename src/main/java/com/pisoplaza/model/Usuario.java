package com.pisoplaza.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "Usuario")
@Data @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, length = 255)
    private String password;

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

    @Column(columnDefinition = "BIT DEFAULT 1")
    private Boolean activo = true;
}
