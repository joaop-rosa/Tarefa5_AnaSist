public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        /*
         * Delegado a tarefa de criar empréstimo para a classe que atualmente serve de
         * controller da aplicação
         */
        Emprestimo emprestimo = new Emprestimo(livro1, "João");
        Emprestimo emprestimo2 = new Emprestimo(livro2, "Maria");

        biblioteca.registrarEmprestimo(emprestimo);
        biblioteca.registrarEmprestimo(emprestimo2);
        System.out.println("Empréstimos registrados:");
        biblioteca.exibirEmprestimos();
    }
}
