import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca agora desacoplada da lógica de notificação
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private ServicoNotificacao servicoNotificacao; // Usa a interface de notificação

    public Biblioteca(ServicoNotificacao servicoNotificacao) {
        this.emprestimos = new ArrayList<>();
        this.servicoNotificacao = servicoNotificacao;
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, String contatoUsuario,
            LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, contatoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Calcula multas e notifica usuários com atraso
    public void notificarUsuariosComAtraso() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                if (diasAtraso > 0) {
                    String mensagem = "Você tem uma multa de R$ " + (diasAtraso * 2.0) + " pelo livro \""
                            + emprestimo.getLivro().getTitulo() + "\".";
                    servicoNotificacao.enviarNotificacao(emprestimo.getContatoUsuario(), "Multa", mensagem);
                }
            }
        }
    }
}
