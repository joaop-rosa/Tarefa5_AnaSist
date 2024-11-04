
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com baixo acoplamento
// A classe Biblioteca foi simplificada para gerenciar apenas a lista de livros.
// Agora, Biblioteca não se preocupa com a criação ou gerenciamento de empréstimos.
class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    // Adiciona um livro à lista da biblioteca
    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    // Método de busca para localizar um livro na biblioteca
    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}