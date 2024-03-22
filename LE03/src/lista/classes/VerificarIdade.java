package lista.classes;

public class VerificarIdade {

    public void verificador_idade(int[] pessoas, int i) {

        if (pessoas[i] >= 18) {
            System.out.println("Maior de Idade\n");
        } else {
            System.out.println("Menor de Idade\n");
        }
    }
}