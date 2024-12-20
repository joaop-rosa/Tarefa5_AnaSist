
// Classe de Teste
import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Inicializa a biblioteca com o serviço de notificação por e-mail
        ServicoNotificacao notificacaoEmail = new NotificacaoEmail();
        Biblioteca biblioteca = new Biblioteca(notificacaoEmail);

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.registrarEmprestimo(livro1, "João", "joao@email.com", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", "maria@email.com", LocalDate.now().minusDays(10));

        System.out.println("\nNotificando usuários com atraso:");
        biblioteca.notificarUsuariosComAtraso();
    }
}