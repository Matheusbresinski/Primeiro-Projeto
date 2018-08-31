package tp;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		int valor [] = new int[6];
		Scanner entrada = new Scanner(System.in);
		int media;
		for(int i = 0; i < 4; i++) {	
		System.out.println("entre com o valor: "+ i);
		valor[i] = entrada.nextInt();
		}
		
		valor[5]=0;
		for(int i = 0; i < 4; i++) {	
			valor[5] += valor[i];
		}
		media= valor[5]/5;
		System.out.println("média é: "+ media);
	}

}
