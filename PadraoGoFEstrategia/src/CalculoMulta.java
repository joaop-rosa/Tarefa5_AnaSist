/**
 * Interface que define o contrato para o cálculo de multas.
 * Cada tipo de mídia terá sua própria implementação desta interface.
 */
public interface CalculoMulta {
    double calcularMulta(long diasAtraso);
}
