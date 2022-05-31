
package aulaifelse;

import java.util.Scanner;

public class Aulaifelse {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Tente adivinhar o numero que pensei");
        
        int palpite = entrada.nextInt();
        
        if (palpite == 15){
            System.out.println("Parabens! vc acertou");
        }else if (palpite > 15){
            System.out.println("Palpite maior do que o esperado");
        }else{
            System.out.println("Palpite menor do que o esperado");
      
    }
        }
    
}
