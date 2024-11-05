
import java.time.LocalDate;

// Implementação do cálculo de multa para DVDs (com uma regra diferente)
class CalculadorMultaDVD implements CalculadorMulta {
    @Override
    public double calcularMulta(LocalDate dataDevolucao) {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 3.0 : 0.0; // Multa de 3 reais por dia de atraso para DVDs
    }
}