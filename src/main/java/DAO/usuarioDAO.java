package DAO;

import Entity.Usuario;
import Connection.ConnectionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarioDAO {
    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO REGISTRAR (NOME, SOBRENOME, EMAIL, SENHA) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConnectionBD.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSobrenome());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getSenha());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
