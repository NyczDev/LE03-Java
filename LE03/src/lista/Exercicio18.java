package lista;

import java.util.Scanner;

import lista.classes.ReajusteSexo;

public class Exercicio18 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = scanner.nextDouble();

        ReajusteSexo reajusteSexo = new ReajusteSexo(nome, idade, sexo, salarioFixo);

        System.out.println("Nome: " + reajusteSexo.getNome());
        System.out.println("Abono: R$ " + reajusteSexo.getAbono());
        System.out.println("Salário Líquido: R$ " + reajusteSexo.calcularSalarioLiquido());

        scanner.close();
    }
}