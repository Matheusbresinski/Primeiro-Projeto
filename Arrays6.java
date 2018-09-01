package tp;

import java.util.Arrays;

public class Arrays6 {

	public static void main(String[] args) {
		int[] numeros = {67,87,54,68,63,23,46,98,9};
		int posicao;
		
		System.out.println("Os elementos do array são: "+ Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println("Array ordenado: "+ Arrays.toString(numeros));
		posicao=Arrays.binarySearch(numeros, 67);
		System.out.println("Posição do elemento '67':" + posicao);

}
}