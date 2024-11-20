package Connection;

import Connection.ConnectionBD;
import java.sql.Connection;
import java.sql.SQLException;


public class Connectiontest {
    public static void main(String[] args) {
        try (Connection conn = ConnectionBD.getConnection()) {
            if (conn != null) {
                System.out.println("Conexão bem-sucedida!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
