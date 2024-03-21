package lista;

import lista.classes.Veiculo;

import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
            Scanner sc = new Scanner(System.in);
            
            double totalDesconto = 0;
            double totalPago = 0;
            
            while (true) {
                System.out.println("Informe o valor do veículo (ou 0 para encerrar): ");
                double valorVeiculo = sc.nextDouble();
                
                if (valorVeiculo == 0) {
                    break;
                }
                
                System.out.println("Informe o tipo de combustível\n1 - alcool\n2 - gasolina\n3 - diesel");
                String combustivel = sc.next();
                
                Veiculo veiculo = new Veiculo(valorVeiculo, combustivel);
                double desconto = veiculo.calcularDesconto();
                
                totalDesconto += desconto;
                totalPago += veiculo.calcularValorFinal();
                
                System.out.printf("Desconto: R$ %.2f%n", desconto);
                System.out.printf("Valor a ser pago pelo cliente: R$ %.2f%n", veiculo.calcularValorFinal());
            }
            
            System.out.printf("Total de descontos: R$ %.2f%n", totalDesconto);
            System.out.printf("Total pago pelos clientes: R$ %.2f%n", totalPago);
            
            sc.close();
        }
    }
    