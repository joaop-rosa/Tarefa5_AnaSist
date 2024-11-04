// Implementação do RepositorioDeMidias usando uma lista em memória
// Aqui, definimos a forma de armazenamento das mídias usando uma lista.

import java.util.ArrayList;
import java.util.List;

class RepositorioDeMidiasEmMemoria implements RepositorioDeMidias {
    private List<Midia> midias;

    public RepositorioDeMidiasEmMemoria() {
        this.midias = new ArrayList<>();
    }

    @Override
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    @Override
    public List<Midia> obterTodasAsMidias() {
        return new ArrayList<>(midias);
    }
}