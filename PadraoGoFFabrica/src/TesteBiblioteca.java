// Classe de Teste
public class TesteBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Utiliza fábricas para criar e adicionar mídias
        MidiaFactory livroFactory = new LivroFactory();
        MidiaFactory revistaFactory = new RevistaFactory();

        biblioteca.adicionarMidia(livroFactory, "O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarMidia(revistaFactory, "National Geographic", "202");

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}