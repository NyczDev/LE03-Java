package lista;

import java.util.Scanner;
import lista.classes.VerificarSexo;

public class Exercicio11 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        String pessoas[] = new String[5];
        int contM = 0;
        int contF = 0;

        VerificarSexo objVerificador = new VerificarSexo(ler);

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Digite seu nome(%d): ", i + 1);
            pessoas[i] = ler.nextLine();

            int opcao = objVerificador.verificador_sexo();

            switch (opcao) {
                case 1:
                    contM++;
                    break;
                case 2:
                    contF++;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

        System.out.printf("%d Homens e %d Mulheres", contM, contF);

        ler.close();
    }

}