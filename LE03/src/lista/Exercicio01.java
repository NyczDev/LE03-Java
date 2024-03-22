package lista;

import java.util.Scanner;
import lista.classes.Aluno;

public class Exercicio01 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do Aluno: ");
        String nome = ler.nextLine();

        System.out.println("Digite a Nota 1: ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite a Nota 2: ");
        double nota2 = ler.nextDouble();
        System.out.println("Digite a Nota 3: ");
        double nota3 = ler.nextDouble();

        Aluno objAluno = new Aluno(nome, nota1, nota2, nota3);
        double media = objAluno.calcular_media(nota1, nota2, nota3);

        System.out.println("Nome: " + nome);
        System.out.printf("Média: %.2f", media);

        ler.close();
    }

}