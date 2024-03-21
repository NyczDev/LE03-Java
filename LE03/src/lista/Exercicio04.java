package lista;

import lista.classes.Conversor;

import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a cotação do dólar (US$): ");
    double cotacaoDolar = sc.nextDouble();

    Conversor conversor = new Conversor(cotacaoDolar);

    System.out.print("Informe a quantidade de dólares (US$): ");
    double quantidadeDolar = sc.nextDouble();

    double valorReal = conversor.converterDolarParaReal(quantidadeDolar);

    System.out.printf("O valor em reais (R$) é: R$ %.2f%n", valorReal);

    sc.close();
}
}

