package lista.classes;


public class Conversor {
    private double cotacaoDolar;

    public Conversor(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterDolarParaReal(double quantidadeDolar) {
        return quantidadeDolar * cotacaoDolar;
    }
}