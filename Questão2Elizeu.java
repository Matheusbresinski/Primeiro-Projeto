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
public class Questão2Elizeu {
        public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);              //criando o objeto encarregado do método de leitura de valores
        System.out.println("Este programa requer valores dados pelo usuário e deles extrai a média aritmética. Bem-vindo!!!");          //introdução do programa ao usuário
        System.out.println("");         //solta linha
        System.out.print("Informe quantos números você usará para este cálculo de média: ");            //instrução ao usuário para uso do programa
        int qn = reader.nextInt();          //método usado para inserção de valores à variável qn/qn=quantidade de números (inteiro)
        System.out.println("");         //solta linha
        float [] number = new float[qn];            //criação da array number, ou seja, essa variável guardará valores reais (float), dispostas da posição 0 até o valor de qn
        float s = 0;                //criação do somador dos números que serão usados ao decorrer da aplicação
        int i;
        
        for(i = 0; i < qn; i++){            
            
            System.out.print("Informe um número que será utilizado no cálculo de média: ");
            number [i] = reader.nextFloat();
            s = s + number [i];
        }
        
        number [qn - 1] = s/qn;
        System.out.println("");
        System.out.printf("A média que se obtém através dos valores citados é %.2f\n\n\n\n\n", number[qn - 1]);
        System.out.println("A seguir estão os números abaixo da média:");
        float f = number[qn - 1];
        
        for(i = 0; i < qn; i++){
            if(number[i] < f){
                System.out.println(number[i]);
            }
        }
        System.out.println("\n\n\n\nA seguir estão os números acima da média:");
       
        for(i = 0; i < qn; i++){
            if(number[i] > f){
                System.out.println(number[i]);
        
            }
        }    
    }
    
}

