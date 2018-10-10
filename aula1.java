package tp1;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class aula1 {

	public static void main(String[] args)throws IOException {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.printf("Informe o nome que deverá ser gravado no arquivo:\n");
			nome = ler.nextLine();
			
			FileWriter arq = new FileWriter("C:\\Users\\20172in003\\Desktop\\Nome.txt");
			PrintWriter impressaoArq = new PrintWriter(arq);
			impressaoArq.printf("O nome digitado é: %s %n" , nome);
			arq.close();
			
			System.out.printf("\n O nome %s foi gravado com sucesso em C:\\Users\\20172in003\\Desktop\\Nome.txt", nome);

	}

}
