package lista.classes;

public class IntervaloDeNum {

    public int verificarnumeros(int[] num, int cont) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 10 && num[i] <= 150) {
                cont++;
            }
        }
        return cont;
    }
}