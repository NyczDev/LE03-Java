package lista;

import java.util.Scanner;
import lista.classes.CalculadoraPesoIdeal;

public class Exercicio23 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sexo da pessoa (M/F): ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Digite a altura da pessoa: ");
        double altura = sc.nextDouble();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        double pesoIdeal = CalculadoraPesoIdeal.calcularPesoIdeal(sexo, altura, idade);

        System.out.println("Nome: " + nome);
        System.out.printf("Peso ideal: %.2f", pesoIdeal);

        sc.close();
    }
}
