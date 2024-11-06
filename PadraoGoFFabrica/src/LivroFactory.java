// Fábrica específica para criar instâncias de Livro
class LivroFactory implements MidiaFactory {
    @Override
    public Midia criarMidia(String titulo, String autor) {
        return new Livro(titulo, autor);
    }
}