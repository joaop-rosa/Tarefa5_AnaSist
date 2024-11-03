import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Com essa Classe é possível gerenciar tudo relacionado a emprétimos em um só lugar
 */
public class EmprestimoService {
    private List<Emprestimo> emprestimos; // Gerencia os empréstimos

    public EmprestimoService() {
        this.emprestimos = new ArrayList<>();
    }

    /*
     * Ajustado esse método para já receber o livro e não precisar chamar Biblioteca
     * para encontra-lo
     */
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro,
                nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);

    }

    // Função para devolver um livro
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) &&
                    !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    // Função para calcular multas de todos os empréstimos
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " +
                        emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
}
