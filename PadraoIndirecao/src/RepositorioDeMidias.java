// Interface RepositorioDeMidias que define métodos para gerenciar o armazenamento de mídias
// Essa interface age como um intermediário, desacoplando a Biblioteca do armazenamento.

import java.util.List;

interface RepositorioDeMidias {
    void adicionarMidia(Midia midia);

    List<Midia> obterTodasAsMidias();
}