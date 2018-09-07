/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoesArrays;
import java.util.Scanner;
/**
 *
 * @author Rossi
 */
public class Questão3Elizeu {
    
    public static void main (String []args){
        Scanner reader = new Scanner (System.in);
        String [][] mes = new String [2][6]; 
        System.out.println("Digite abaixo todos os meses corretamente. O não-cumprimento deste tópico ocasionará em erros graves no funcionamento do programa. Obrigado!!!");
        int l = 0;                      //linha 1 da matriz
        int n = 1;                      //linha 2 da matriz
        int c;                          //colunas
        
            for(c = 0; c < 6; c++){
                mes [l][c] = reader.next();         // lê meses da linha 1
                        
                
            }
        
        
            for(c = 0; c < 6; c++){
                mes [n][c] = reader.next();          // lê meses da linha 2
                }
            
            System.out.println("\n\n\n\n\n\nOs meses abaixo são os que apresentam 31 dias");
            
            for(c = 0; c < 6; c++){
                if(c % 2 == 0){
                    System.out.println(mes [l][c]);           //meses com  31 dias da linha 1
                }
            }
            
            for(c = 0; c < 6; c++){
                if(c < 1){
                    System.out.println(mes [n][c]);                 // exceção lógica dos meses com 31 dias da linha 2
                }else{
                    if(c % 2 != 0){
                        System.out.println(mes[n][c]);                  //meses com 31 dias da linha 2
                    }
                }
            }
    }
}
        
        
        
    