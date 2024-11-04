// Revista também implementa Midia, o que permite tratá-la de forma polimórfica na Biblioteca.
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

    // Método que retorna a descrição da revista
    @Override
    public String getDescricao() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}
