package lista;

import java.util.Scanner;
import lista.classes.Seguro;

public class Exercicio26 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do pretendente: ");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o grupo de risco do pretendente (baixo, médio ou alto): ");
        String grupoRisco = sc.nextLine();

        Seguro seguro = new Seguro(nome, idade, grupoRisco);
        String categoria = seguro.determinarCategoria();

        System.out.println("Nome: " + seguro.getNome());
        System.out.println("Idade: " + seguro.getIdade());
        System.out.println("Grupo de Risco: " + seguro.getGrupoRisco());
        System.out.println("Categoria: " + categoria);

        sc.close();
    }
}
