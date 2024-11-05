// Implementação do serviço de notificação por SMS (exemplo de extensão)
class NotificacaoSMS implements ServicoNotificacao {
    @Override
    public void enviarNotificacao(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
