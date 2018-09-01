package tp;
import java.util.Arrays;
public class Arrays3 {

	public static void main(String[] args) {
		int[] numeros= { 1, 4, 0, -13, 2112, 14, 17, 0, -97};
		
		System.out.println("Os elementos do array são: "+ Arrays.toString(numeros));
		System.out.println("Ordenado...");
		
		Arrays.sort(numeros);
		
		System.out.println("Array ordenado: "+ Arrays.toString(numeros));
		

}
}