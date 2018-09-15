import java.util.ArrayList;
import java.util.Scanner;

public class numero1{
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<String> cores = new ArrayList<String>();



    for (int i=1; i<= 5 ; i++ ) {
      System.out.printf("Digite as cores %s: ", i);
      cores.add(entrada.nextLine());
    }

    System.out.printf("\n Digite a cor  %s", cores.toString());
    cores.add(0, "Verde");
    cores.add(5, "Amarelo");
    cores.add(7, "Azul");
    System.out.printf("\n Digite a cor %s",cores.toString());

  }
}
