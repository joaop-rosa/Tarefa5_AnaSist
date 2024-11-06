// Classe Livro implementa a interface Midia
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

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}