import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca que usa a configuração única
public class Biblioteca {
    private List<String> livros;
    private ConfiguracaoBiblioteca configuracaoBiblioteca; // Referência para a configuração global

    public Biblioteca() {
        this.livros = new ArrayList<>();
        // Obtém a instância única de ConfiguracaoBiblioteca
        this.configuracaoBiblioteca = ConfiguracaoBiblioteca.getInstancia("08:00 - 18:00", 2.0);
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    // Exibe as configurações da biblioteca
    public void exibirConfiguracoes() {
        System.out.println(configuracaoBiblioteca.toString());
    }
}