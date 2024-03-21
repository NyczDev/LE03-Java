package lista;

import java.util.Scanner;

import lista.classes.Reajuste;

public class Exercicio17 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = sc.nextDouble();

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Digite a porcentagem de reajuste desejada:");
        double porcentagemReajuste = sc.nextDouble();

        Reajuste reajuste = new Reajuste(nome, salarioAtual, salarioMinimo, porcentagemReajuste);

        System.out.printf("Funcionário: %s%n", reajuste.getNome());
        System.out.printf("Salário atual: R$ %.2f%n", reajuste.getSalarioAtual());

        double novoSalario = reajuste.calcularReajuste();
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);

        double aumentoFolha = reajuste.calcularAumentoFolha();
        System.out.printf("Aumento na folha de pagamento: R$ %.2f%n", aumentoFolha);

        sc.close();
    }
}

