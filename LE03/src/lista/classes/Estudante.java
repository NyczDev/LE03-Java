package lista.classes;

public class Estudante {
    private String nome;
    private int numeroMatricula;
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaExameFinal;

    public Estudante(String nome, int numeroMatricula, double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }

    public String classificarEstudante() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }

    public void imprimirDados() {
        double notaFinal = calcularNotaFinal();
        String classificacao = classificarEstudante();

        System.out.println("Nome: " + nome);
        System.out.println("Número de Matrícula: " + numeroMatricula);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
    }
}
