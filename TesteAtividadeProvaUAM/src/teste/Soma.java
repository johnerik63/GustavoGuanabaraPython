package teste;

import  java.util.Scanner;
public class Soma

{

    public static void main(String[] args)

    {
//Scanner = Classe da variável;
//entrada = Nome da variável;
//new Scanner = cria um objeto Scanner que lê dados digitados pelo usuario;
//System.in = Objeto de entrada padrão;
        Scanner entrada = new Scanner(System.in); 
        int num1;

        int num2;

        int soma;

        

       System.out.print("Digite o primeiro numero; ");  
//exibe um texto na tela de comando

       num1 = entrada.nextInt();      
//num1 = Variável de preferência do usuario;   
//entrada = Variáel do objeto Scanner;   
//nextInt() = metodo utilizado;

       System.out.print("Digite o segundo numero; ");

       num2 = entrada.nextInt();

       soma = num1 + num2;
//soma o valor das duas variáveis

      System.out.println("Soma igual a " + soma); 
//exibe o valor somado

    }

}