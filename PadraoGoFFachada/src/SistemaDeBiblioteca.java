import java.time.LocalDate;

/**
 * Classe principal que utiliza a Fachada para interagir com o sistema da
 * biblioteca.
 */
public class SistemaDeBiblioteca {
    public static void main(String[] args) {
        // Instância da fachada
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        // Adicionando livros e revistas
        biblioteca.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarRevista("National Geographic", 202);

        // Registrando um empréstimo
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.registrarEmprestimo(livro, "João", LocalDate.now().minusDays(5));

        // Calculando multa
        Emprestimo emprestimo = new Emprestimo(livro, "João", LocalDate.now().minusDays(5));
        double multa = biblioteca.calcularMulta(emprestimo);
        System.out.println("Multa para João: R$ " + multa);
    }
}
