package tp1;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class ArqEx1 {

	public static void main(String[] args)throws IOException {
		Scanner ler = new Scanner(System.in);
		int i,n;
		System.out.println("Infome o número para a tabuada:\n");
		n = ler.nextInt();
		
		FileWriter arq = new FileWriter("C:\\Users\\20172in003\\Desktop\\Matheus.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("+-- Resultado--+%n");
		for(i=1; i<=10; i++){
			gravarArq.printf("| %2d X %d = %2d |%n", i,n, (i*n));
			
		}
		gravarArq.printf("+----------------------+%n");
		arq.close();
		System.out.printf("\n O nome %s foi gravado com sucesso em C:\\Users\\20172in003\\Desktop\\Matheus.txt", n);

	}

}
