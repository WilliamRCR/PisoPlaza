package com.pisoplaza.controller;

import com.pisoplaza.dto.JwtResponse;
import com.pisoplaza.dto.LoginRequest;
import com.pisoplaza.model.Usuario;
import com.pisoplaza.repository.UsuarioRepository;
import com.pisoplaza.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
        String token = jwtUtil.generateToken(userDetails);

        Usuario usuario = usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
        return ResponseEntity.ok(new JwtResponse(token, usuario.getUsername(), usuario.getRol().getNombre()));
    }
}