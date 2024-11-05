import java.time.LocalDate;

// Classe que representa um empréstimo
class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private String contatoUsuario; // Pode ser um e-mail ou telefone
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    public Emprestimo(Livro livro, String nomeDoUsuario, String contatoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.contatoUsuario = contatoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
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

    public String getContatoUsuario() {
        return contatoUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public long calcularDiasAtraso() {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return diasAtraso > 0 ? diasAtraso : 0;
    }
}