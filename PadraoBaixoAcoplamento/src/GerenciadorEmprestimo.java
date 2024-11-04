import java.time.LocalDate;

// Interface para operações de empréstimo
// A interface GerenciadorEmprestimo define operações relacionadas aos empréstimos, promovendo
// baixo acoplamento ao permitir que a Biblioteca use essa interface sem conhecer detalhes de implementação.
public interface GerenciadorEmprestimo {
    void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao);

    void devolverLivro(String tituloDoLivro);

    void calcularMultas();
}
