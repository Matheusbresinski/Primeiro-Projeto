package tp1;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class aula2 {

	public static void main(String[] args)throws IOException {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int nota1;
		int nota2;
		int media;
		System.out.println("Informe o nome do aluno:\n");
		nome = ler.nextLine();
		System.out.println("Digite a nota um: ");
		nota1 = ler.nextInt();
		System.out.println("Digite a nota dois");
		nota2 = ler.nextInt();
		media=(nota1+nota2)/2;
		
		
			
		FileWriter arq = new FileWriter("C:\\Users\\20172in003\\Desktop\\Matheus.txt");
		PrintWriter impressaoArq = new PrintWriter(arq);
		impressaoArq.println("O nome digitado e " + nome + " e a média é " + media );
		arq.close();
			
			System.out.printf("\n O nome %s foi gravado com sucesso em C:\\Users\\20172in003\\Desktop\\Matheus.txt", nome, media);

	}

}
