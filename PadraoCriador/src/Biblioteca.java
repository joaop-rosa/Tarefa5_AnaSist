import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    /*
     * Foi removido a tarefa de criar o empréstimp de Biblioteca
     * Agora ela recebe o empréstimo já criado e apenas adiciona a lista de
     * empréstimos
     */
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }
}
