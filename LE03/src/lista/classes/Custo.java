package lista.classes;

public class Custo {
    public static double calcularCustoConsumidor(double custoFabrica, double percentualDistribuidor, double impostos, double custoComImpostos) {
        return custoComImpostos = (custoFabrica * (1 + impostos)) * (1 + percentualDistribuidor);  
    }
}
