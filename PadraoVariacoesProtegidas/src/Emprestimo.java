import java.time.LocalDate;

// Classe que representa um empréstimo de mídia (livro ou DVD)
class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    private CalculadorMulta calculadorMulta; // Calculador de multa específico

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao, CalculadorMulta calculadorMulta) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        this.calculadorMulta = calculadorMulta; // Injetamos o calculador de multa
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    // Delegamos o cálculo da multa para o CalculadorMulta
    public double calcularMulta() {
        return calculadorMulta.calcularMulta(dataDeDevolucao);
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: "
                + dataDeDevolucao;
    }
}