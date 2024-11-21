/**
 * Interface que define o contrato para os observadores.
 * Observadores devem implementar este contrato para serem notificados.
 */
public interface Observador {
    /**
     * Método chamado quando o sujeito notifica os observadores.
     */
    void atualizar(String mensagem);
}
