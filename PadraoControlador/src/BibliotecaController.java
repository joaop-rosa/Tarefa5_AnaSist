import java.time.LocalDate;

public class BibliotecaController {
    Biblioteca biblioteca = new Biblioteca();

    /*
     * Com essa classe foi possível isolar a lógica das iterações
     */

    public void exibirMultas() {
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " +
                        emprestimo.getNomeDoUsuario() + ", Livro: " +
                        emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    public void consultarLivrosAtrasados() {
        System.out.println("\nConsultando livros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.estaAtrasado()) {
                System.out.println(emprestimo);
            }
        }
    }

    public void registrarEmprestimo(Livro livro, String nomeUsuario, int diasDeEmprestimo) {
        biblioteca.registrarEmprestimo(livro, nomeUsuario, LocalDate.now().minusDays(diasDeEmprestimo));
    }

    public void devolverLivro(Livro livro) {
        biblioteca.devolverLivro(livro);
    }
}
