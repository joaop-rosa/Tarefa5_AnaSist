import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros; // Gerencia os livros

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    /*
     * adicionarLivro() e encontrarLivro() é interessante que estejam na classe
     * Biblioteca já que é algo que a biblioteca contém
     */
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    /*
     * Os métodos de empréstimo foram movidos para uma Service de empréstimos, para
     * que sejá algo mais coeso
     */

}
