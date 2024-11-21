import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma coleção de mídias, implementando a interface Midia.
 * Pode conter outras mídias ou coleções.
 */
public class ColecaoDeMidias implements Midia {
    private String nome;
    private List<Midia> midias;

    public ColecaoDeMidias(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    /**
     * Adiciona uma mídia à coleção.
     * 
     * Mídia ou coleção a ser adicionada.
     */
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    @Override
    public void exibir() {
        System.out.println("Coleção: " + nome);
        for (Midia midia : midias) {
            midia.exibir();
        }
    }
}
