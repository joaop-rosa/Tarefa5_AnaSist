/**
 * Classe que representa uma revista, implementando a interface Midia.
 */
public class Revista implements Midia {
    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public void exibir() {
        System.out.println("Revista: " + titulo + ", Edição: " + edicao);
    }
}