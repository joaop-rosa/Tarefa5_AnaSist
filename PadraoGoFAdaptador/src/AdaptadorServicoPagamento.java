// Adaptador que adapta a interface do serviço externo para a interface PagamentoMulta
class AdaptadorServicoPagamento implements PagamentoMulta {
    private ServicoPagamentoExterno servicoPagamentoExterno;

    public AdaptadorServicoPagamento() {
        this.servicoPagamentoExterno = new ServicoPagamentoExterno();
    }

    @Override
    public void pagarMulta(String usuario, double valor) {
        // Converte a chamada para o formato esperado pelo serviço externo
        servicoPagamentoExterno.pagarFatura(usuario, valor);
    }
}
