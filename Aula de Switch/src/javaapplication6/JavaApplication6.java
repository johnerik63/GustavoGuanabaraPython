
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {


    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite um numero de 1 a 7");
        int numero = entrada.nextInt();
        
        switch(numero){
            
            case 1:
                System.out.println("domingo");
                break;
                
            case 2:
                System.out.println("segunda-feira");
                break;
                
            case 3:
                System.out.println("terca-feira");
                break;
                
            case 4:
                System.out.println("quarta-feira");
                break;
                
            case 5:
                System.out.println("quinta-feira");
                break;
                
            case 6:
                System.out.println("sexta-feira");
                break;
                
            case 7:
                System.out.println("sabado");
                break;
                
            default:
                System.out.println("numero digitado esta fora de 1 a 7"); 
                
        }
        
    }
    
}
