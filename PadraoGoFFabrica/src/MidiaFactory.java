// Interface da fábrica de mídias, com método de criação abstrato
interface MidiaFactory {
    Midia criarMidia(String titulo, String autorOuEdicao);
}