/**
 * Estratégia de cálculo de multa para livros.
 * Implementa a lógica específica para calcular multas de livros.
 */
public class MultaLivro implements CalculoMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}