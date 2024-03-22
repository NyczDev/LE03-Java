package lista;

import java.util.Scanner;
import lista.classes.Estudante;

public class Exercicio25 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();

        System.out.println("Digite o número de matrícula do estudante: ");
        int numeroMatricula = sc.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = sc.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10): ");
        double notaSemestral = sc.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = sc.nextDouble();

        Estudante estudante = new Estudante(nome, numeroMatricula, notaLaboratorio, notaSemestral, notaExameFinal);
        estudante.imprimirDados();

        sc.close();
    }
}
