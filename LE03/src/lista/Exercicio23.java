package lista;

import java.util.Scanner;
import lista.classes.CalculadoraPesoIdeal;

public class Exercicio23 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = ler.nextLine();
        System.out.println("Digite o sexo da pessoa (M/F): ");
        char sexo = ler.nextLine().charAt(0);
        System.out.println("Digite a altura da pessoa: ");
        double altura = ler.nextDouble();
        System.out.println("Digite a idade da pessoa: ");
        int idade = ler.nextInt();

        double pesoIdeal = CalculadoraPesoIdeal.calcularPesoIdeal(sexo, altura, idade);

        System.out.println("Nome: " + nome);
        System.out.printf("Peso ideal: %.2f", pesoIdeal);

        ler.close();
    }
}
