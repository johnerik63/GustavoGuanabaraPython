package mes;

import java.util.Scanner;

public class lista {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("===== Menu de opcoes =====");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Sair do Sistema");
        System.out.println("===== Menu de opcoes =====");
        int lista = entrada.nextInt();

        switch (lista) {
            case 1:
                System.out.println("Voce escolheu o menu 1");
                System.out.println("Que e a opcao Cadastrar Produtos.");
                break;
            case 2:
                System.out.println("Voce escolheu o menu 2");
                System.out.println("Que e a opcao Listar Produtos.");
                break;
            case 3:
                System.out.println("Voce escolheu o menu 3");
                System.out.println("Que e a opcao Sair do Sistema.");
                break;
        }
    }}