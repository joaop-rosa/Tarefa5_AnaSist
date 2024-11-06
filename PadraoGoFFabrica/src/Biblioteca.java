import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca utiliza as fábricas para criar mídias sem conhecer detalhes das implementações
class Biblioteca {
    private List<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Método para adicionar mídia utilizando uma fábrica
    public void adicionarMidia(MidiaFactory factory, String titulo, String autorOuEdicao) {
        Midia midia = factory.criarMidia(titulo, autorOuEdicao); // Uso da fábrica para criar a mídia
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.toString());
        }
    }
}