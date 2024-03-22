package lista.classes;
import java.util.Scanner;

public class VerificarSexo {

    public Scanner ler;

    public VerificarSexo(Scanner ler) {
        this.ler = ler;
    }

    public int verificador_sexo() {
        System.out.printf("Digite seu sexo: \n1 - Masculino \n2 - Feminino\n");
        int opcao = ler.nextInt();
        ler.nextLine();

        return opcao;
    }
}