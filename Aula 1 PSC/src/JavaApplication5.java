
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {


    public static void main(String[] args) {
 
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("digite um numero");
        int numero = entrada.nextInt();
        
        if (numero >= 50 && <= 100){
            System.out.println("pertence ao intervalo");
        }else{
            System.out.println("nao pertence ao intervalo");         
        }
    }
    
}
