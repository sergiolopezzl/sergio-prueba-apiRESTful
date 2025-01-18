package app.apiRESTful.controller;

import app.apiRESTful.model.Usuario;
import app.apiRESTful.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*") // <-- Esto permite peticiones desde cualquier origen
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar() { return service.listar(); }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) { return service.guardar(usuario); }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return service.guardar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminar(id); }
}
