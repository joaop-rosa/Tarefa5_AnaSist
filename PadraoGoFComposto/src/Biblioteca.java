import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a Biblioteca.
 * Usa o padrão Composto para gerenciar mídias e coleções de maneira uniforme.
 */
public class Biblioteca {
    private List<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    /**
     * Adiciona uma mídia ou coleção à biblioteca.
     */
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    /**
     * Exibe todas as mídias e coleções da biblioteca.
     */
    public void exibirBiblioteca() {
        System.out.println("Biblioteca:");
        for (Midia midia : midias) {
            midia.exibir();
        }
    }
}
