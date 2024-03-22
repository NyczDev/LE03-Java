package lista;

import java.util.Scanner;

import lista.classes.ReajusteSexo;

public class Exercicio18 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = sc.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = sc.next().charAt(0);

        System.out.println("Digite o salário fixo do funcionário:");
        double salarioFixo = sc.nextDouble();

        ReajusteSexo reajusteSexo = new ReajusteSexo(nome, idade, sexo, salarioFixo);

        System.out.println("Nome: " + reajusteSexo.Nome());
        System.out.println("Abono: R$ " + reajusteSexo.Abono());
        System.out.println("Salário Líquido: R$ " + reajusteSexo.calcularSalarioLiquido());

        sc.close();
    }
}