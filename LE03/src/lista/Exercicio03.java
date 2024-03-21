package lista;

import java.util.Scanner;
import lista.classes.Vendedor;

public class Exercicio03 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu Salário Fixo: ");
        double salar_fix = sc.nextDouble();
        System.out.println("Digite o total de vendas do mês: ");
        double totalvendas = sc.nextDouble();

        Vendedor objVend = new Vendedor(nome, salar_fix, totalvendas);

        double salar_final = objVend.calcular_salario(salar_fix, totalvendas);
        System.out.printf("Seu sálario final sera de R$%.2f", salar_final);

        sc.close();
    }

}