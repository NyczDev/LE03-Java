package lista;

import java.util.Scanner;
import lista.classes.NotaEstudante;

public class Exercicio24 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = sc.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10): ");
        double notaSemestral = sc.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = sc.nextDouble();

        NotaEstudante notaEstudante = new NotaEstudante(notaLaboratorio, notaSemestral, notaExameFinal);
        double notaFinal = notaEstudante.calcularNotaFinal();

        System.out.println("A nota final do estudante é: " + notaFinal);

        sc.close();
    }
}
