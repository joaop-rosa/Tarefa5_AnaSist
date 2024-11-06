// Classe que gerencia configurações da biblioteca usando o padrão Singleton
public class ConfiguracaoBiblioteca {
    private static ConfiguracaoBiblioteca instanciaUnica; // Variável estática para manter a única instância da classe
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

    // Construtor privado para impedir que a classe seja instanciada de fora
    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

    // Método estático para obter a instância única de ConfiguracaoBiblioteca
    public static ConfiguracaoBiblioteca getInstancia(String horariosDeFuncionamento, double valorMultaDiaria) {
        if (instanciaUnica == null) { // Cria a instância apenas se ela ainda não existir
            instanciaUnica = new ConfiguracaoBiblioteca(horariosDeFuncionamento, valorMultaDiaria);
        }
        return instanciaUnica; // Retorna a instância única da classe
    }

    // Métodos de acesso para os atributos de configuração
    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}
