package lista;

import java.util.Scanner;
import lista.classes.Pessoa;

public class Exercicio13 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de pessoas: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        int aptos = 0;
        int naoAptos = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.nextLine().charAt(0);
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Saúde (S/N): ");
            char saude = sc.next().charAt(0);
            sc.nextLine();
            
            Pessoa objPessoa = new Pessoa(nome, sexo, idade, saude);
            if (objPessoa.estaApto()) {
                System.out.println("Está apto para o serviço militar obrigatório.");
                aptos++;
            } else {
                System.out.println("Não está apto para o serviço militar obrigatório.");
                naoAptos++;
            }
        }

        System.out.println("\nTotal de aptos: " + aptos);
        System.out.println("Total de não aptos: " + naoAptos);

        sc.close();
    }
}