package apiController;

import Service.UsuarioService;
import Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Endpoint para listar todos os usuários
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    // Endpoint para buscar usuário por ID
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable int id) {
        return usuarioService.getUsuarioById(id);
    }

    // Endpoint para remover usuário por ID
    @DeleteMapping("/{id}")
    public void removerUsuario(@PathVariable int id) {
        usuarioService.removerUsuario(id);
    }
}
