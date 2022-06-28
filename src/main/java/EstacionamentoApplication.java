import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class EstacionamentoApplication {

    public static void main(String[] args) {
        //aulaLambda();
        exercicioLambda();
    }

    //Implementar a saída de veículos
    //e filtrar todos que ficaram mais de 2h no estacionamento (com lambda)
    private static void exercicioLambda() {

    }

    private static void aulaLambda() {
        Estacionamento shopping = new EstacionamentoShopping();
        shopping.entradaVeiculo(new Veiculo("ABC1234", Categoria.PEQUENO));
        shopping.entradaVeiculo(new Veiculo("ABC1235", Categoria.PEQUENO));
        shopping.entradaVeiculo(new Veiculo("ABC1236", Categoria.GRANDE));
        shopping.entradaVeiculo(new Veiculo("DBC1237", Categoria.GRANDE));
        shopping.entradaVeiculo(new Veiculo("ABC1238", Categoria.MEDIO));
        shopping.entradaVeiculo(new Veiculo("ABC1239", Categoria.MEDIO));

        //shopping.listarVeiculos();
        //shopping.listarVeiculoPorCategoriaPorPlaca(Categoria.GRANDE);

        shopping.listarPorCategoria(Categoria.GRANDE, new PesquisaVeiculo() {
            @Override
            public boolean filtrar(Veiculo veiculo, Categoria categoria) {
                return veiculo.getCategoria().equals(categoria);
            }
        });

        shopping.listarPorCategoria( v -> v.getCategoria().equals(Categoria.MEDIO));


        shopping.listarPorCategoria(Categoria.MEDIO, (v, c) -> v.getCategoria().equals(c));

        shopping.listarPorCategoria(Categoria.GRANDE, (v, c) -> v.getCategoria().equals(c) && v.getPlaca().startsWith("ABC"));

        shopping.listarPorCategoria(Categoria.PEQUENO, new PesquisaVeiculo() {
            @Override
            public boolean filtrar(Veiculo veiculo, Categoria categoria) {
                return veiculo.getCategoria().equals(categoria) && veiculo.getPlaca().startsWith("ABC");
            }
        });
    }

    private static void exemploDateTime() {

        LocalDate localDate = LocalDate.of(2022, 1, 10);

        var quad = localDate.query(t -> {
            LocalDate ld = LocalDate.from(t);

            if (ld.getMonthValue() == 1) {
                print(ld);
            }

            return (int) Math.ceil(ld.getMonthValue() / 4d);
        });


        //System.out.println(quad);
    }


   public static void print(LocalDate localDate) {
       System.out.printf(localDate.toString());
   }

}
