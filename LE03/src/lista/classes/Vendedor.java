package lista.classes;

public class Vendedor {
    public String nome;
    public double salar_fix;
    public double totalvendas;

    public Vendedor(String nome, double totalvendas, double salar_fix) {
        this.nome = nome;
        this.totalvendas = totalvendas;
        this.salar_fix = salar_fix;
    }

    public double calcular_salario(double salar_fix, double totalvendas){
        return salar_fix + ((totalvendas * 0.15) + totalvendas);
    }
}