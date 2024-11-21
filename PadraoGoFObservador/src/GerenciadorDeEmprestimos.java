import java.util.ArrayList;
import java.util.List;

/**
 * Gerenciador de Empréstimos atua como o sujeito no padrão Observer.
 */
public class GerenciadorDeEmprestimos implements Sujeito {
    private List<Emprestimo> emprestimos; // Lista de empréstimos
    private List<Observador> observadores; // Lista de observadores

    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    /**
     * Registra um empréstimo e notifica os observadores.
     */
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + emprestimo.getUsuario().getNome());
        notificarObservadores("Novo empréstimo registrado para o livro: " + emprestimo.getLivro().getTitulo());
    }

    /**
     * Verifica os prazos de devolução e notifica os observadores sobre devoluções
     * iminentes.
     */
    public void verificarDevolucoes() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() > 0) {
                String mensagem = "Lembrete: O prazo de devolução do livro \"" + emprestimo.getLivro().getTitulo() +
                        "\" está se aproximando!";
                notificarObservadores(mensagem);
            }
        }
    }
}
