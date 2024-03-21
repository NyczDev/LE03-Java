package lista;

import java.util.Scanner;

import lista.classes.PrecoVenda;

public class Exercicio06 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = sc.nextDouble();

        System.out.print("Digite o percentual de acréscimo (em %): ");
        double percentualAcrescimo = sc.nextDouble();

        PrecoVenda precoVenda = new PrecoVenda();

        double precoVendaFinal = precoVenda.calculoPrecoVenda(precoCusto, percentualAcrescimo);

        System.out.printf("O preço de venda do produto é: R$ %.2f%n", precoVendaFinal);

        sc.close();
    }
}