// Classe de Teste
public class TesteBibliotecaMalProjetada {
    public static void main(String[] args) {
        // Ambas as bibliotecas compartilharão a mesma instância de configuração
        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca();

        biblioteca1.adicionarLivro("O Senhor dos Anéis");
        biblioteca2.adicionarLivro("1984");

        System.out.println("\nConfigurações da Biblioteca 1:");
        biblioteca1.exibirConfiguracoes();

        System.out.println("\nConfigurações da Biblioteca 2:");
        biblioteca2.exibirConfiguracoes();
    }
}