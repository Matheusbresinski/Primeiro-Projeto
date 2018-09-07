/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoesArrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Rossi
 */
public class Questão5Elizeu {
    public static void main (String[]args){
        int [] valores = new int [8];
        int i;
        Scanner reader = new Scanner (System.in);
        System.out.println("Insira 8 valores, vamos transformá-los todos no valor 10");
        
        for(i = 0; i < 8; i++){
            valores[i] = reader.nextInt();
            
        }
        System.out.println("\n\n\n\nEsses são os valores inseridos");
        System.out.print(Arrays.toString(valores));
        
        System.out.println("\n\n\n\nE esses são os valores após a transformação");
        Arrays.fill(valores, 10);
        System.out.println(Arrays.toString(valores));
        System.out.println("\n\n\n\n");
    
    }
}

    
