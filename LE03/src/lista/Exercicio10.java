package lista;

import java.util.Scanner;
import lista.classes.VerificarIdade;

public class Exercicio10 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de pessoas: ");
        int tamvet = sc.nextInt();

        int pessoas[] = new int[tamvet];

        VerificarIdade objVerificador = new VerificarIdade();

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Digite a idade da %d(º) pessoa: ", i + 1);
            pessoas[i] = sc.nextInt();

            objVerificador.verificador_idade(pessoas, i);
        }

        sc.close();
    }

}