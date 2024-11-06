// Interface padrão para o serviço de pagamento usada pela Biblioteca
interface PagamentoMulta {
    void pagarMulta(String usuario, double valor);
}