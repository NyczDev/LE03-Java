package lista.classes;

public class ContaLuz {
    private String tipoCliente;
    private double valorKWh;

    public ContaLuz(String tipoCliente) {
        this.tipoCliente = tipoCliente;
        switch (tipoCliente.toLowerCase()) {
            case "residência":
                this.valorKWh = 0.602;
                break;
            case "comércio":
                this.valorKWh = 0.483;
                break;
            case "indústria":
                this.valorKWh = 1.29;
                break;
            default:
                this.valorKWh = 0.0;
        }
    }

    public double calcularValorConta(int consumoKWh) {
        return consumoKWh * this.valorKWh;
    }
}
