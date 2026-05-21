package com.pisoplaza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MercadoJalapaApplication {
    public static void main(String[] args) {
        // Genera el hash y muéstralo en consola
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hash = encoder.encode("admin123");
        System.out.println(">>> HASH GENERADO: " + hash);

        SpringApplication.run(MercadoJalapaApplication.class, args);
    }
}