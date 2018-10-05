import java.util.Scanner;
import java.util.ArrayList;
class matheus {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      ArrayList<Integer> ele = new ArrayList<Integer>();
      int loop, i, opcao;
      int somaDaArray = 0;
      int media = 0;

      System.out.println(" Inserção 5 notas:");
        for(i =0; i < 5; i++){
        System.out.printf("Digite %d nota ", i +1);
        ele.add(entrada.nextInt());
        somaDaArray += ele.get(i);
        }

        System.out.printf(ele.toString());
        do{
        System.out.printf("\nDigite 1 para adicionar uma nova nota: ");
        System.out.printf("\nDigiTE 2 para remover uma nota ");
        System.out.printf("\nDigite 3 para falar o tamanho do array e quais são os elementos ");
        System.out.printf("\nDigite 4 para escrever a soma dos elementos do array: ");
        System.out.printf("\nDigite 5 para escrever a média dos elementos  ");

        opcao = entrada.nextInt();
          switch(opcao){
            case 1:
            System.out.printf("\nInforme a nota a ser adicionada ");
            ele.add(entrada.nextInt());
            System.out.printf("\nNota adiconada com sucesso!");
            System.out.printf(ele.toString());
            break;
            case 2:
            System.out.printf("\nDigiTE  qual o índice da nota a ser removida: ");
            ele.remove(entrada.nextInt());
            System.out.printf("\nNota  removida com sucesso!");
            System.out.printf(ele.toString());
            break;
            case 3:
            System.out.printf("\nO tamanho do array e: %s", ele.size());
            System.out.printf(ele.toString());
            break;
            case 4:
            System.out.println("A soma das notas são : "+ somaDaArray);

            break;
            case 5:
            media= somaDaArray/ele.size();
            System.out.println("A média dos elementos é:  "+media);

            break;
          }

        System.out.printf("\nDeseja continuar o programa? Se sim digite 1 - caso não digite 2 ");
        loop = entrada.nextInt();
      }while(loop==1);
    }
}
