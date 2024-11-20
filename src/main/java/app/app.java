package app;

import Entity.Usuario;
import DAO.usuarioDAO;

public class app {
    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.setNome("Wilson");
        u.setSobrenome("God");
        u.setEmail("wilsongod@gmail.com");
        u.setSenha("shaolinmatador");

        new usuarioDAO().cadastrarUsuario(u);
    }
}
