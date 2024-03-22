package lista.classes;

public class CalcularDesconto {
    public int totalCarrosAte2000;
    public int totalGeral;

    public CalcularDesconto() {
        this.totalCarrosAte2000 = 0;
        this.totalGeral = 0;
    }

    public void calcularDesconto(int ano, double valor) {
        double desconto;
        if (ano <= 2000) {
            desconto = valor * 0.12;
            totalCarrosAte2000++;
        } else {
            desconto = valor * 0.07;
        }

        double valorPago = valor - desconto;
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a ser pago pelo cliente: R$ %.2f\n", valorPago);

        totalGeral++;
    }

    public void exibirTotais() {
        System.out.printf("Total de carros com ano até 2000: %d\n", totalCarrosAte2000);
        System.out.printf("Total geral de carros: %d\n", totalGeral);
    }
}