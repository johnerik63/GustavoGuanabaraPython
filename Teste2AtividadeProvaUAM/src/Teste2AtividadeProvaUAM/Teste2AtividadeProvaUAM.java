package Teste2AtividadeProvaUAM;

import java.util.Scanner;

public class Teste2AtividadeProvaUAM {
    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in); 
            
       System.out.println("Digite o valor de x");
            int x = entrada.nextInt();
            
            System.out.println("Digite o valor de y");
            int y = entrada.nextInt();
            
            System.out.println("Digite o valor de z");
            int z = entrada.nextInt();
            
            if (x >= y && y >= z) {
                System.out.println("maior: x-> " + x);
            } else if (x >= z && z >= y) {
                System.out.println("maior: z-> " +z);
            } else if (y >= x && x >= z) {
                System.out.println("maior: x-> " +x);
            } else if (y >= z && z >= x) {
                System.out.println("maior: y-> " +y);
            } else if (z >= x && x >= y) {
                System.out.println("maior: z-> " +z);
            } else {
                System.out.println("maior: z-> " +y);
            }
    }
}