import java.time.LocalDate;

// Classe de Teste
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        PagamentoMulta adaptadorPagamento = new AdaptadorServicoPagamento(); // Utiliza o adaptador
        Biblioteca biblioteca = new Biblioteca(adaptadorPagamento);

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        System.out.println("\nProcessando pagamentos de multas:");
        biblioteca.processarPagamentosDeMultas();
    }
}