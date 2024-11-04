public class TesteBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando diferentes tipos de mídia usando o método polimórfico
        biblioteca.adicionarMidia(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarMidia(new Revista("National Geographic", 202));
        biblioteca.adicionarMidia(new Livro("1984", "George Orwell"));

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}