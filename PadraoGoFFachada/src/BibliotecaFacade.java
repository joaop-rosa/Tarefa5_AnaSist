import java.time.LocalDate;

/**
 * Classe Fachada que fornece uma interface simplificada para as operações da
 * biblioteca.
 */
public class BibliotecaFacade {
    private GerenciadorDeLivros gerenciadorDeLivros;
    private GerenciadorDeRevistas gerenciadorDeRevistas;
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos;
    private CalculadoraDeMultas calculadoraDeMultas;

    public BibliotecaFacade() {
        this.gerenciadorDeLivros = new GerenciadorDeLivros();
        this.gerenciadorDeRevistas = new GerenciadorDeRevistas();
        this.gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();
        this.calculadoraDeMultas = new CalculadoraDeMultas();
    }

    /**
     * Adiciona um livro à biblioteca.
     */
    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        gerenciadorDeLivros.adicionarLivro(livro);
    }

    /**
     * Adiciona uma revista à biblioteca.
     */
    public void adicionarRevista(String titulo, int edicao) {
        Revista revista = new Revista(titulo, edicao);
        gerenciadorDeRevistas.adicionarRevista(revista);
    }

    /**
     * Registra um empréstimo.
     */
    public void registrarEmprestimo(Livro livro, String nomeUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeUsuario, dataDeDevolucao);
        gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo);
    }

    /**
     * Calcula a multa de um empréstimo.
     */
    public double calcularMulta(Emprestimo emprestimo) {
        return calculadoraDeMultas.calcularMulta(emprestimo);
    }
}
