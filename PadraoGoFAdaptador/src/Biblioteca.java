import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca usando o adaptador ao invés do serviço externo diretamente
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private PagamentoMulta servicoPagamento; // Usando interface do adaptador

    public Biblioteca(PagamentoMulta servicoPagamento) {
        this.emprestimos = new ArrayList<>();
        this.servicoPagamento = servicoPagamento;
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Processa as multas e paga através do adaptador de pagamento
    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                servicoPagamento.pagarMulta(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}