package mes;

import java.util.Scanner;

public class mes {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 12");
        int mes_digitado = entrada.nextInt();

        switch(mes_digitado){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            default:
                System.out.println("Valor diferente de 1 a 12");
        }

    }
}
