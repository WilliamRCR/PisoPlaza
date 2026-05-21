package com.pisoplaza.service;
import com.pisoplaza.model.Rol;
import com.pisoplaza.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service @RequiredArgsConstructor
public class RolService {
    private final RolRepository repo;
    public List<Rol> findAll() { return repo.findAll(); }
    public Rol findById(Integer id) { return repo.findById(id).orElseThrow(); }
    public Rol save(Rol rol) { return repo.save(rol); }
    public Rol update(Integer id, Rol rol) {
        Rol existing = findById(id);
        existing.setNombre(rol.getNombre());
        return repo.save(existing);
    }
    public void delete(Integer id) { repo.deleteById(id); }
}
