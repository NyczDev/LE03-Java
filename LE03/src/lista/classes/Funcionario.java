package lista.classes;

public class Funcionario {
    private double salario;
    private static final double salarioMinimo = 1412;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste() {
        if (salario < 3 * salarioMinimo) {
            return salario * 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 0.15;
        } else {
            return salario * 0.1;
        }
    }

    public double calcularSalarioFinal() {
        return salario + calcularReajuste();
    }
}
