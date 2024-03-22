import java.util.Scanner;

import lista.* ;
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o exercício que deseja executar:");
        System.out.println("1. Exercício 1");
        System.out.println("2. Exercício 2");
        System.out.println("3. Exercício 3");
        System.out.println("4. Exercício 4");
        System.out.println("5. Exercício 5");
        System.out.println("6. Exercício 6");
        System.out.println("7. Exercício 7");
        System.out.println("8. Exercício 8");
        System.out.println("9. Exercício 9");
        System.out.println("10. Exercício 10");
        System.out.println("11. Exercício 11");
        System.out.println("12. Exercício 12");
        System.out.println("13. Exercício 13");
        System.out.println("14. Exercício 14");
        System.out.println("15. Exercício 15");
        System.out.println("16. Exercício 16");
        System.out.println("17. Exercício 17");
        System.out.println("18. Exercício 18");
        System.out.println("19. Exercício 19");
        System.out.println("20. Exercício 20");
        System.out.println("21. Exercício 21");
        System.out.println("22. Exercício 22");
        System.out.println("23. Exercício 23");
        System.out.println("24. Exercício 24");
        System.out.println("25. Exercício 25");
        System.out.println("26. Exercício 26");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            
              case 1:
              Exercicio01.executar();
              break;
              case 2:
              Exercicio02.executar();
              break;
              case 3:
              Exercicio03.executar();
              break;
              case 4:
              Exercicio04.executar();
              break;
              case 5:
              Exercicio05.executar();
              break;
              case 6:
              Exercicio06.executar();
              break;
              case 7:
              Exercicio07.executar();
              break;
              case 8:
              Exercicio08.executar();
              break;
              case 9:
              Exercicio09.executar();
              break;
              case 10:
              Exercicio10.executar();
              break;
              case 11:
              Exercicio11.executar();
              break;
              case 12:
              Exercicio12.executar();
              break;
              case 13:
              Exercicio13.executar();
              break;
              case 14:
              Exercicio14.executar();
              break;
              case 15:
              Exercicio15.executar();
              break; 
              case 16:
              Exercicio16.executar();
              break;
              case 17:
              Exercicio17.executar();
              break;
              case 18:
              Exercicio18.executar();
              break;
              case 19:
              Exercicio19.executar();
              break;
              case 20:
              Exercicio20.executar();
              break;
              case 21:
              Exercicio21.executar();
              break;
              case 22:
              Exercicio22.executar();
              break;
              case 23:
              Exercicio23.executar();
              break;
              case 24:
              Exercicio24.executar();
              break;
              case 25:
              Exercicio25.executar();
              break;
              case 26:
              Exercicio26.executar();
              break;
             default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }

}