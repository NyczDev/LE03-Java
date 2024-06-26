package lista;

import lista.classes.Consumo;

import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a distância total percorrida (em km): ");
        double distanciaTotal = sc.nextDouble();

        System.out.print("Informe o total de combustível gasto (em litros): ");
        double combustivelGasto = sc.nextDouble();

        Consumo consumo = new Consumo(distanciaTotal, combustivelGasto);

        double consumoMedio = consumo.calcularConsumoMedio();

        System.out.println("O consumo médio do automóvel foi de: " + consumoMedio + " km/l");

        sc.close();
    }
}
