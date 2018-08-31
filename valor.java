package tp;

import java.util.Scanner;

public class valor {

	public static void main(String[] args) {
		int valor [] = new int[6];
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {	
		System.out.println("entre com o valor: "+ i);
		valor[i] = entrada.nextInt();
		}
		
		valor[5]=0;
		for(int i = 0; i < 4; i++) {	
			valor[5] += valor[i];
		}
		System.out.println("A soma dos numero vai ser o valor: "+ valor[5]);
	}

}
