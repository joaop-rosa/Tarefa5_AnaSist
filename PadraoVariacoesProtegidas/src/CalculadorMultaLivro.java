import java.time.LocalDate;

// Implementação do cálculo de multa para livros
public class CalculadorMultaLivro implements CalculadorMulta {
    @Override
    public double calcularMulta(LocalDate dataDevolucao) {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0; // Multa fixa de 2 reais por dia de atraso para livros
    }
}
