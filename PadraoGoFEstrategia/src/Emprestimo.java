import java.time.LocalDate;

public class Emprestimo {
    private Object midia;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    private CalculoMulta calculoMulta;

    public Emprestimo(Object midia, String nomeDoUsuario, LocalDate dataDeDevolucao, CalculoMulta calculoMulta) {
        this.midia = midia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        this.calculoMulta = calculoMulta;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public long calcularDiasAtraso() {
        return LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
    }

    public double calcularMulta() {
        long diasAtraso = calcularDiasAtraso();
        return calculoMulta.calcularMulta(diasAtraso);
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }
}
