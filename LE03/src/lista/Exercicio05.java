package lista;

import java.util.Scanner;

import lista.classes.Compra;

public class Exercicio05 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        Compra compra = new Compra(valorCompra);

        double valorPrestacao = compra.calcularValorPrestacao();

        System.out.printf("O valor de cada prestação (5x sem juros) é de: R$ %.2f%n", valorPrestacao);

        sc.close();
    }
}
