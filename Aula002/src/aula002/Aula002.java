package aula002;

import java.util.Scanner;

public class Aula002 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero "); 
        
        int numero_Digitado = in.nextInt();
        System.out.println("O numero digitado foi:" + numero_Digitado);
        for(int i=0; i<numero_Digitado; i++){
            System.out.print(i + " ");
        }
    }
    
}