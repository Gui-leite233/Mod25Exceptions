import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        try {
            cadastroUsuario.cadastrarUsuario(nome, idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Processo de cadastro finalizado.");
        }

        scanner.close();
    }
}
