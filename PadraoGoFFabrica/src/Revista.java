// Classe Revista implementa a interface Midia
class Revista implements Midia {
    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}
