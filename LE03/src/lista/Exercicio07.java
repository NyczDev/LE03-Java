package lista;

import java.util.Scanner;

import lista.classes.Custo;

public class Exercicio07 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double percentualDistribuidor = 0.28, impostos = 0.45;
        double custoComImpostos = 0;

        Custo calcularCustoConsumidor = new Custo();

        double custo = Custo.calcularCustoConsumidor(custoFabrica, percentualDistribuidor, impostos, custoComImpostos);

        System.out.printf("O custo ao consumidor do carro é: R$ %.2f%n", custo);

        sc.close();
    }
}
