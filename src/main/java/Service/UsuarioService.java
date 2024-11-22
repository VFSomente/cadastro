package Service;

import DAO.usuarioDAO;
import Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private usuarioDAO usuarioDAO;

    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }

    public Usuario getUsuarioById(int id) {
        return usuarioDAO.getUsuarioById(id);
    }

    public void removerUsuario(int id) {
        usuarioDAO.removerUsuarioPorId(id);
    }
}
