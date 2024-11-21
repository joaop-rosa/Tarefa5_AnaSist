/**
 * Estratégia de cálculo de multa para revistas.
 * Implementa a lógica específica para calcular multas de revistas.
 */
public class MultaRevista implements CalculoMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0; // R$ 1,00 por dia
    }
}