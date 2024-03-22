package lista;
import java.util.Scanner;

import lista.classes.SalarProfessor;

public class Exercicio20 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nível do professor (1, 2 ou 3): ");
        int nivel = sc.nextInt();

        System.out.println("Informe a quantidade de horas/aula dadas: ");
        int horasAula = sc.nextInt();

        SalarProfessor salarProfessor = new SalarProfessor(nivel);
        double salario = salarProfessor.calcularSalario(horasAula);

        System.out.println("O salário do professor é: R$" + salario);

        sc.close();
    }
}

