package app.apiRESTful.service;

import app.apiRESTful.model.Usuario;
import app.apiRESTful.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listar() { return repository.findAll(); }
    public Usuario guardar(Usuario usuario) { return repository.save(usuario); }
    public void eliminar(Long id) { repository.deleteById(id); }
}