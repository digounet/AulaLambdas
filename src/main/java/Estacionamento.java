import java.util.function.Predicate;

public interface Estacionamento {
    void entradaVeiculo(Veiculo veiculo);
    void saidaVeiculo(Veiculo veiculo);
    void cobrar(Veiculo veiculo);

    void listarVeiculos();
    void listarVeiculoPorCategoria(Categoria categoria);

    void listarVeiculoPorCategoriaDia(Categoria categoria);
    void listarVeiculoPorCategoriaPorPlaca(Categoria categoria);

    void listarPorCategoria(Categoria categoria, PesquisaVeiculo pesquisaVeiculo);

    void retornaVeiculoValor(PesquisaVeiculoPreco pesquisaVeiculoPreco );

    void listarPorCategoria(Predicate<Veiculo> pesquisaVeiculoPreco);
}
