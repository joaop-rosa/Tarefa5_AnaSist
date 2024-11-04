
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca com polimorfismo
// A classe Biblioteca agora usa a interface Midia para tratar de forma genérica
// todas as mídias, evitando o uso de instanceof e facilitando a adição de novos tipos de mídia.
class Biblioteca {
    private List<Midia> midias; // Lista de mídias com tipo Midia

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    // Adiciona uma mídia à lista
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    // Exibe informações de todas as mídias de forma polimórfica
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia); // Chama o método toString() polimorficamente
        }
    }
}
