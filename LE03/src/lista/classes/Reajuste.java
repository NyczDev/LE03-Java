package lista.classes;

public class Reajuste {
    private String nome;
    private double salarioAtual;
    private double salarioMinimo;
    private double porcentagemReajuste;

    public Reajuste(String nome, double salarioAtual, double salarioMinimo, double porcentagemReajuste) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
        this.salarioMinimo = salarioMinimo;
        this.porcentagemReajuste = porcentagemReajuste;
    }

    public double calcularReajuste() {
        double novoSalario = salarioAtual * (1 + porcentagemReajuste / 100);
        return novoSalario;
    }

    public double calcularAumentoFolha() {
        return calcularReajuste() - salarioAtual;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public double getPorcentagemReajuste() {
        return porcentagemReajuste;
    }
}

