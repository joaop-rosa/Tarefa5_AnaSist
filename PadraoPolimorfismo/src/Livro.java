// Agora Livro implementa a interface Midia, permitindo que possa ser tratada como uma Midia.
class Livro implements Midia {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    // Método que retorna a descrição do livro
    @Override
    public String getDescricao() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}