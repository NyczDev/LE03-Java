package lista;

import lista.classes.Produto;

import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[40];

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Informe o preço de custo do produto %d: ", i + 1);
            double precoCusto = sc.nextDouble();

            System.out.printf("Informe o preço de venda do produto %d: ", i + 1);
            double precoVenda = sc.nextDouble();

            produtos[i] = new Produto(precoCusto, precoVenda);
        }

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (Produto produto : produtos) {
            somaPrecoCusto += produto.getPrecoCusto();
            somaPrecoVenda += produto.getPrecoVenda();

            System.out.println("Resultado: " + produto.calcularLucroOuPrejuizo());
        }

        double mediaPrecoCusto = somaPrecoCusto / produtos.length;
        double mediaPrecoVenda = somaPrecoVenda / produtos.length;

        System.out.printf("Média de preço de custo: R$ %.2f%n", mediaPrecoCusto);
        System.out.printf("Média de preço de venda: R$ %.2f%n", mediaPrecoVenda);

        sc.close();
    }
}
