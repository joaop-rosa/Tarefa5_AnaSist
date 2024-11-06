// Fábrica específica para criar instâncias de Revista
class RevistaFactory implements MidiaFactory {
    @Override
    public Midia criarMidia(String titulo, String edicao) {
        return new Revista(titulo, Integer.parseInt(edicao));
    }
}