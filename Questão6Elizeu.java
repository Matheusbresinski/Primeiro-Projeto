/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoesArrays;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Rossi
 */
public class Questão6Elizeu {
    public static void main(String[]args){
        String [] nombre = new String [5];
        String name [] = new String [5];
        int i;
        Scanner reader = new Scanner (System.in);
        
        for(i = 0; i < 5; i++){
            nombre [i] = reader.next();
        }
        
        for(i = 0; i < 5; i++){
            name [i] = reader.next();
        }
        
       Arrays.equals(nombre, name);
        if(Arrays.equals(nombre, name) == true){
            System.out.println("Os arrays são iguais");
        }else{
            System.out.println("Os arrays são diferentes");
        }
        
    }
    
}
