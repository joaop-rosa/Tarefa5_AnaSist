import java.time.LocalDate;

public class CalculadoraDeMultas {
    public double calcularMulta(Emprestimo emprestimo) {
        long diasAtraso = LocalDate.now().toEpochDay() -
                emprestimo.getDataDeDevolucao().toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}
