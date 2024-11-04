public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Cria uma implementação de RepositorioDeMidias
        RepositorioDeMidias repositorio = new RepositorioDeMidiasEmMemoria();
        // Passa o repositório para a Biblioteca
        Biblioteca biblioteca = new Biblioteca(repositorio);

        // Adiciona mídias à biblioteca
        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Midia revista1 = new Revista("National Geographic", 202);

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }

}
