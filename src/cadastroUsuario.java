public class cadastroUsuario {

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("O usuário precisa ser maior de idade para se cadastrar.");
        }
        System.out.println("usuário " + nome + ", foi cadastrado com sucesso.");
    }
}
