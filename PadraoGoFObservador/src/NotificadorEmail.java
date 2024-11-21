/**
 * Observador concreto que envia notificações por email.
 */
public class NotificadorEmail implements Observador {
    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Enviando email para " + email + ": " + mensagem);
    }
}
