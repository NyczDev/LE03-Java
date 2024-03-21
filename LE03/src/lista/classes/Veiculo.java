package lista.classes;

public class Veiculo {
    private double valor;
    private String combustivel;

    public Veiculo(double valor, String combustivel) {
        this.valor = valor;
        this.combustivel = combustivel;
    }

    public double calcularDesconto() {
        switch (combustivel.toLowerCase()) {
            case "1":
                return valor * 0.25;
            case "2":
                return valor * 0.21;
            case "3":
                return valor * 0.14;
            default:
                return 0;
        }
    }

    public double calcularValorFinal() {
        return valor - calcularDesconto();
    }
}

