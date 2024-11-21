import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Instância do gerenciador de empréstimos (sujeito)
        GerenciadorDeEmprestimos gerenciador = new GerenciadorDeEmprestimos();

        // Criando observadores (notificadores)
        Observador notificadorJoao = new NotificadorEmail("joao@email.com");
        Observador notificadorMaria = new NotificadorEmail("maria@email.com");

        // Registrando observadores
        gerenciador.adicionarObservador(notificadorJoao);
        gerenciador.adicionarObservador(notificadorMaria);

        // Criando livro e empréstimo
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Usuario usuario = new Usuario("João", "joao@email.com");
        Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now().plusDays(3));

        // Registrando o empréstimo
        gerenciador.registrarEmprestimo(emprestimo);

        // Verificando devoluções (simula o envio de notificações)
        System.out.println("\nVerificando devoluções:");
        gerenciador.verificarDevolucoes();
    }
}
