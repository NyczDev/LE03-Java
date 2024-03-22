package lista.classes;

public class Triangulo {
    private int side1;
    private int side2;
    private int side3;

    public Triangulo(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getType() {
        if (side1 == side2 && side2 == side3) {
            return "Equilátero";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isóscele";
        } else {
            return "Escaleno";
        }
    }

    public boolean isValid() {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
}
