import java.time.LocalDate;

public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        BibliotecaController bibliotecaController = new BibliotecaController();

        /*
         * Foi criado a classe BibliotecaController para lidar com os eventos/iterações
         * com biblioteca
         */

        // Funcionalidade 1: Registrar empréstimos
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");
        bibliotecaController.registrarEmprestimo(livro1, "João", 5);
        bibliotecaController.registrarEmprestimo(livro2, "Maria", 10);

        // Funcionalidade 3: Exibir multas
        System.out.println("\nMultas registradas:");
        bibliotecaController.exibirMultas();

        // Funcionalidade 2: Devolver um livro
        System.out.println("\nDevolvendo livro 1984...");
        bibliotecaController.devolverLivro(livro2);

        // Funcionalidade 3: Exibir multas novamente
        System.out.println("\nMultas após devolução:");
        bibliotecaController.exibirMultas();

        // Funcionalidade 4: Consultar livros em atraso
        bibliotecaController.consultarLivrosAtrasados();
    }
}
