/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoesArrays;
import java.util.Arrays;
/**
 *
 * @author Rossi
 */
public class Questão1Elizeu {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numbers = {18, 9, 2000, 21, 3, 2001, 9, 5, 18, 31, 12, 589, 6578, 1, 45, 45, 58, 65498498, 214, 59};
        System.out.println("Elementos do array => " + Arrays.toString(numbers));
        for(int i = 1; i < numbers.length; i++){
            for(int j = 0; j < i; j++){
                if(numbers[i] > numbers[j]){
                int t = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = t;
                }
            }
        }
        System.out.println("\n\n\nElementos em ondem decrescente:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\n\n\n");
    }
    }
    
