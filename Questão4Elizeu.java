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
public class Questão4Elizeu {
    public static void main (String[] args){
        System.out.println("OK! Seja bem-vindo ao MONTA-MATRIZES. Você está tendo a oportunidade de preencher espaços que ocupam um tamanho pré-definido por você, usuário, que sabe melhor que ninguém de suas próprias necessidades. Esperamos que curta o projeto - PEACE!!!");
        System.out.println("\n\n\nO primeiro passo para a felicidade é você informar quantas linhas você deseja ter em sua matriz. Vamos lá!!!");
        System.out.print("Número de linhas: ");
        Scanner reader = new Scanner (System.in);
        int l = reader.nextInt();       //l==linha
        System.out.println("\n\n\nMuito bem! Agora, nos informe o número de colunas que você acha que essa matriz precisa para ficar insana!!!");
        System.out.println("Núemro de colunas: ");
        int c = reader.nextInt();       //c == coluna
        System.out.println("\n\n\nMatriz criada!!! hehe");
        System.out.println("Agora, você preencherá sua matriz, de modo que uma linha de cada vez seja enumerada");
        int [][] m = new int [l][c];                 //m = matriz, apresentando l linhas e c colunas
        int cl;                             //contador de linha 
        int cc;                                     //contador de coluna
        
        for(cl = 0; cl < l; cl++){
            for(cc = 0; cc < c; cc++){
                m [cl][cc] = reader.nextInt();
                
            }
            
            if(cl != (l-1)){
            System.out.println("Próxima linha! Está mandando ver hehehe");
            }
        }
        System.out.println("Muito bem! Agora, contemple à vontade a sua criação\n");
        for(cl = 0; cl < l; cl++){
            System.out.println("");
            for(cc = 0; cc < c; cc++){
                System.out.printf("%d     ", m [cl][cc]);
            }
        }
        System.out.println("\n\n\nObrigado por participar deste projeto! Visite nossa plataforma quantas vezes desejar.\n\n\n\n");
    }
    
}






//Crie um programa que preencha um array multidimensional de tamanho definido pelo usuário. O array deverá ser do tipo inteiro.