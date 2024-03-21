package lista.classes;

public class Prestacao {
  
    public double valorTotal;

    public Prestacao(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularValorPrestacao() {
        return valorTotal / 5;
    }  
}
