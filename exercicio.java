import java.util.ArrayList;
import java.util.Scanner;

public class exercicio{
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<String> NomeAlunos = new ArrayList<String>();



    for (int i=1; i<= 5 ; i++ ) {
      System.out.printf("Digite o nome da %s: pesssoa ", i);
      NomeAlunos.add(entrada.nextLine());
    }
    System.out.printf("O terceiro nome inserido foi: %s", NomeAlunos.get(2));
    System.out.printf("\n O tamanho do array e: $s ", NomeAlunos.size());
    System.out.printf("\n Os nomes add ao array são %s", NomeAlunos.toString());
    System.out.printf("\n Os nomes add ao array são %s",NomeAlunos.toString());

  }
}
