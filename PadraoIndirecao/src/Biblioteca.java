// Classe Biblioteca que utiliza o RepositorioDeMidias para armazenar mídias
// A Biblioteca agora está desacoplada da forma de armazenamento, utilizando a interface RepositorioDeMidias.

class Biblioteca {
    private RepositorioDeMidias repositorio;

    public Biblioteca(RepositorioDeMidias repositorio) {
        this.repositorio = repositorio;
    }

    // Adiciona uma mídia ao repositório através do intermediário
    public void adicionarMidia(Midia midia) {
        repositorio.adicionarMidia(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    // Exibe todas as mídias do repositório, sem saber como elas estão armazenadas
    public void exibirMidias() {
        for (Midia midia : repositorio.obterTodasAsMidias()) {
            midia.exibirDetalhes();
        }
    }
}