import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        EmprestimoService emprestimoService = new EmprestimoService();
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        biblioteca.adicionarLivro("1984");
        /*
         * Ajustado para que já encontre o livro antes de registrar o empréstimo
         */
        Livro livro1 = biblioteca.encontrarLivro("O Senhor dos Anéis");
        Livro livro2 = biblioteca.encontrarLivro("1984");

        emprestimoService.registrarEmprestimo(livro1, "João",
                LocalDate.now().minusDays(5));
        emprestimoService.registrarEmprestimo(livro2, "Maria",
                LocalDate.now().minusDays(10));
        System.out.println("\nMultas:");
        emprestimoService.calcularMultas();
        System.out.println("\nDevolvendo livro 1984...");
        emprestimoService.devolverLivro("1984");
        System.out.println("\nMultas após devolução:");
        emprestimoService.calcularMultas();
    }
}
