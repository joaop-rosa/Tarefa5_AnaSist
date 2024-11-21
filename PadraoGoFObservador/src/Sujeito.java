/**
 * Interface que define o contrato para o sujeito.
 * O sujeito gerencia a lista de observadores e os notifica quando necessário.
 */
public interface Sujeito {
    void adicionarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores(String mensagem);
}
