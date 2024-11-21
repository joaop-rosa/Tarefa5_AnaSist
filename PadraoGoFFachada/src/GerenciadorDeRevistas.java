import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeRevistas {
    private List<Revista> revistas;

    public GerenciadorDeRevistas() {
        this.revistas = new ArrayList<>();
    }

    public void adicionarRevista(Revista revista) {
        revistas.add(revista);
        System.out.println("Revista adicionada: " +
                revista.getTitulo());
    }

    public List<Revista> getRevistas() {
        return revistas;
    }
}