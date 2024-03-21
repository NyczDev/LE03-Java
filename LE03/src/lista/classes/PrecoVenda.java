package lista.classes;

public class PrecoVenda {
    public double calculoPrecoVenda(double precoCusto, double percentualAcrescimo) {
        return precoCusto * (1 + (percentualAcrescimo / 100));
    }
}
