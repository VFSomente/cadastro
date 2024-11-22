package app;

import Entity.Usuario;
import DAO.usuarioDAO;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando dados do usuário via console
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Criando o objeto Usuario com os dados fornecidos
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSobrenome(sobrenome);
        u.setEmail(email);
        u.setSenha(senha);

        // Tentando cadastrar o usuário
        try {
            new usuarioDAO().cadastrarUsuario(u);
            System.out.println("Usuário cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o usuário: " + e.getMessage());
        }

        scanner.close();
    }
}
