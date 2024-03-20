package lista;

import java.util.Scanner;

import lista.classes.Aluno;

public class Exercicio01 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        double media = calcularMedia(aluno);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + media);

        scanner.close();
    }

    public static double calcularMedia(Aluno aluno) {
        return (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
    }
}