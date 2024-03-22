package lista;

import java.util.Scanner;

import lista.classes.CategoriaNadador;
public class Exercicio21 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do nadador para ver a categoria: ");
        int idade = sc.nextInt();

        CategoriaNadador categoriaNadador = new CategoriaNadador(idade);
        String categoria = categoriaNadador.classificarCategoria();

        System.out.println("O nadador está na categoria:" + categoria);

        sc.close();
    }
}