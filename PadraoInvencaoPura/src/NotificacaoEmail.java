// Implementação do serviço de notificação por e-mail
class NotificacaoEmail implements ServicoNotificacao {
    @Override
    public void enviarNotificacao(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}