import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista = new Revista("National Geographic", 202);

        // Registro de empréstimos com suas estratégias
        biblioteca.registrarEmprestimo(livro, "João", LocalDate.now().minusDays(5), new MultaLivro());
        biblioteca.registrarEmprestimo(revista, "Maria", LocalDate.now().minusDays(10), new MultaRevista());

        System.out.println("\nCalculando multas:");
        biblioteca.calcularMultas();
    }
}
