package lista.classes;

public class ReajusteSexo {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;
    private double abono;

    public ReajusteSexo(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
        calcularAbono();
    }

    private void calcularAbono() {
        if (idade >= 30 && sexo == 'F') {
            abono = 200;
        } else if (idade < 30 && sexo == 'F') {
            abono = 80;
        } else if (idade >= 30 && sexo == 'M') {
            abono = 100;
        } else {
            abono = 50;
        }
    }

    public double calcularSalarioLiquido() {
        return salarioFixo + abono;
    }

    public String Nome() {
        return nome;
    }

    public double Abono() {
        return abono;
    }
}
