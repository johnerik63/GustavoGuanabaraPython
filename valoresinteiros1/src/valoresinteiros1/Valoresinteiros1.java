package valoresinteiros1;

import java.util.Scanner;

public class Valoresinteiros1 {


    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero");
        int numero1 = entrada.nextInt();
        
        System.out.println("digite o segundo numero");
        int numero2 = entrada.nextInt();
        
        if (numero1 == numero2){
            System.out.println("numeros iguais");
            
        }else if (numero1 > numero2){
            System.out.println("A diferenca dos numeros que voce digitou e:");
            System.out.println(numero1 - numero2);
            
        }else{
            System.out.println("A diferenca dos numeros que voce digitou e:");
            System.out.println(numero2 - numero1);
            
            
        }
        
    }
    
}
