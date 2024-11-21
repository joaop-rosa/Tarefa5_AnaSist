/**
 * Classe de teste para verificar a implementação com o padrão Composto.
 */
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando mídias individuais
        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Midia revista1 = new Revista("National Geographic", 202);

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);

        // Criando uma coleção de mídias
        ColecaoDeMidias colecaoFantasia = new ColecaoDeMidias("Coleção Fantasia");
        colecaoFantasia.adicionarMidia(new Livro("Harry Potter", "J.K. Rowling"));
        colecaoFantasia.adicionarMidia(new Revista("Comic Book", 1));

        // Adicionando coleção à biblioteca
        biblioteca.adicionarMidia(colecaoFantasia);

        // Exibindo a biblioteca
        System.out.println("\nExibindo a Biblioteca:");
        biblioteca.exibirBiblioteca();
    }
}
