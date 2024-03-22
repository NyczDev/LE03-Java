package lista;
import java.util.Scanner;

import lista.classes.Triangulo;
public class Exercicio19 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1 do triângulo:");
        int lado1 = sc.nextInt();

        System.out.println("Digite o comprimento do lado 2 do triângulo:");
        int lado2 = sc.nextInt();

        System.out.println("Digite o comprimento do lado 3 do triângulo:");
        int lado3 = sc.nextInt();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.isValid()) {
            System.out.println("Os lados podem formar um triângulo do tipo " + triangulo.getType());
        } else {
            System.out.println("Os lados não podem formar um triângulo válido");
        }
        sc.close();
    }
}


