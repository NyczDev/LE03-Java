package lista;

import java.util.Scanner;
import lista.classes.VerificarIdade;

public class Exercicio10 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o total de pessoas: ");
        int tamvet = ler.nextInt();

        int pessoas[] = new int[tamvet];

        VerificarIdade objVerificador = new VerificarIdade();

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Digite a idade da %d(º) pessoa: ", i + 1);
            pessoas[i] = ler.nextInt();

            objVerificador.verificador_idade(pessoas, i);
        }

        ler.close();
    }

}