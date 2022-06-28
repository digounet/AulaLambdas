import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Veiculo {
    private String placa;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private Categoria categoria;
    private Double valorCobrado;

    public Veiculo(String placa, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida, Categoria categoria, Double valorCobrado) {
        this.placa = placa;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.categoria = categoria;
        this.valorCobrado = valorCobrado;
    }

    public Veiculo(String placa, Categoria categoria) {
        this.placa = placa;
        this.dataHoraEntrada = LocalDateTime.now();
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public String toString() {

        return String.format("Placa: %s - Categoria: %-10s - Entrada: %s - Saída: %s ",
                this.placa,
                this.categoria,
                this.dataHoraEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
                this.dataHoraSaida);
    }
}
