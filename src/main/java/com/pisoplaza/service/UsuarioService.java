package com.pisoplaza.service;
import com.pisoplaza.model.Usuario;
import com.pisoplaza.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service @RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repo;
    private final PasswordEncoder passwordEncoder;
    public List<Usuario> findAll() { return repo.findAll(); }
    public Usuario findById(Integer id) { return repo.findById(id).orElseThrow(); }
    public Usuario save(Usuario u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return repo.save(u);
    }
    public Usuario update(Integer id, Usuario u) {
        Usuario existing = findById(id);
        existing.setUsername(u.getUsername());
        if (u.getPassword() != null && !u.getPassword().isBlank())
            existing.setPassword(passwordEncoder.encode(u.getPassword()));
        existing.setRol(u.getRol());
        existing.setActivo(u.getActivo());
        return repo.save(existing);
    }
    public void delete(Integer id) { repo.deleteById(id); }
}