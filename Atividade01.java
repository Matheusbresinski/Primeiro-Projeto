package fase_1_Paulo_Matheus_Daniele_Haleff;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> produto = new ArrayList<>();
		ArrayList<Double> valorUnitario = new ArrayList<>();
		ArrayList<Double> quantidade = new ArrayList<>();
		int opcao = 0;
		int indiceProdutoAlterar;
		
		FileWriter dirArquivo = new FileWriter("C:\\Users\\20172in003\\Desktop\\itens.txt");
		PrintWriter arquivo = new PrintWriter(dirArquivo);
		
		System.out.print("Digite o produto: ");
		produto.add(entrada.next());
		
		System.out.print("Digite o valor unitário: ");
		valorUnitario.add(entrada.nextDouble());
		
		System.out.print("Digite a quantidade : ");
		quantidade.add(entrada.nextDouble());
		
		do {
			System.out.println("");
			System.out.println("Menu de opções");
			System.out.println("1 - Adicionar mais produto.");
			System.out.println("2 - Alterar o produto anterior.");
			System.out.println("3 - Deseja realizar alguma alteração.");
			System.out.println("0 - Fechar o pedido.");
			System.out.println("");
			opcao = entrada.nextInt();
			
			switch(opcao){
			case 1: 
				System.out.print("Digite o produto: ");
				produto.add(entrada.next());
				
				System.out.print("Digite o valor unitário: ");
				valorUnitario.add(entrada.nextDouble());
				
				System.out.print("Digite a quantidade : ");
				quantidade.add(entrada.nextDouble());
				
				System.out.println("");
				
				for(int i = 0; i < quantidade.size(); i++){
					System.out.println(produto.get(i) + " - " + valorUnitario.get(i) + " - " + quantidade.get(i));
				}
				break;
			case 2:
				System.out.print("Digite o produto: ");
				produto.set(produto.size() -1, entrada.next());
				
				System.out.print("Digite o valor unitário: ");
				valorUnitario.set(produto.size() -1, entrada.nextDouble());
				
				System.out.print("Digite a quantidade : ");
				quantidade.set(produto.size() -1, entrada.nextDouble());
				
				System.out.println("");
				
				for(int i = 0; i < quantidade.size(); i++){
					System.out.println(produto.get(i) + " - " + valorUnitario.get(i) + " - " + quantidade.get(i));
				}
				break;
			case 3:
				for(int i = 0; i < quantidade.size(); i++){
					System.out.println((i + 1) + " - " + produto.get(i) + " - " + valorUnitario.get(i) + " - " + quantidade.get(i));
				}
				
				System.out.println("");
				
				System.out.print("Digite o indice do produto a ser alterado: ");
				indiceProdutoAlterar = entrada.nextInt() - 1;
				
				System.out.print("Digite o produto: ");
				produto.set(indiceProdutoAlterar, entrada.next());
				
				System.out.print("Digite o valor unitário: ");
				valorUnitario.set(indiceProdutoAlterar, entrada.nextDouble());
				
				System.out.print("Digite a quantidade : ");
				quantidade.set(indiceProdutoAlterar, entrada.nextDouble());
				
				for(int i = 0; i < quantidade.size(); i++){
					System.out.println((i + 1) + " - " + produto.get(i) + " - " + valorUnitario.get(i) + " - " + quantidade.get(i));
				}
				break;
			default:
				System.out.println("Valor inválido.");
				break;
			}
			
		} while(opcao != 0);
	}
}
