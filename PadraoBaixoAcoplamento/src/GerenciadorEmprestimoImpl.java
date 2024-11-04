import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe responsável por gerenciar os empréstimos
// GerenciadorEmprestimoImpl é uma implementação de GerenciadorEmprestimo. Ela contém a lógica para
// registrar, devolver e calcular multas, delegando responsabilidades que estavam na classe Biblioteca,
// o que melhora a separação de responsabilidades e diminui o acoplamento.
public class GerenciadorEmprestimoImpl implements GerenciadorEmprestimo {

    private List<Emprestimo> emprestimos = new ArrayList<>();
    private Biblioteca biblioteca; // Dependência da Biblioteca, injetada via construtor

    public GerenciadorEmprestimoImpl(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        // Busca o livro na Biblioteca e registra um novo empréstimo caso o livro seja
        // encontrado
        Livro livro = biblioteca.encontrarLivro(tituloDoLivro);
        if (livro != null) {
            Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: Livro \"" + tituloDoLivro + "\" para " + nomeDoUsuario);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    @Override
    public void devolverLivro(String tituloDoLivro) {
        // Percorre a lista de empréstimos para encontrar o livro e atualizar o status
        // de devolução
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    @Override
    public void calcularMultas() {
        // Calcula a multa para cada empréstimo não devolvido com base na data de
        // devolução
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
                double multa = diasAtraso > 0 ? diasAtraso * 2 : 0;
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
}
