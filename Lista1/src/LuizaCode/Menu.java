package LuizaCode;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        int opcao;
        double resultado;
        int numero = 0;
    do {
        System.out.println("-------------MENU-------------");
        System.out.println("1. Raiz Quadrada");
        System.out.println("2. Metade");
        System.out.println("3. 10%");
        System.out.println("4. O Dobro");
        System.out.println("5. Sair");

        System.out.print("Olá informe a opção que deseja! ");
        opcao = menu.nextInt();

        if (opcao != 5) {
            System.out.print("Informe o número: ");
            numero = menu.nextInt();
        }

        switch (opcao) {
            case 1:
                resultado = Math.sqrt(numero);
                System.out.printf("O resultado foi %.2f \n", resultado);
                break;
            case 2:
                resultado = numero / 2;
                System.out.printf("O resultado foi %.2f \n", resultado);
                break;
            case 3:
                resultado = numero * 0.10;
                System.out.printf("O resultado foi %.2f \n", resultado);
                break;
            case 4:
                resultado = numero * 2;
                System.out.printf("O resultado foi %.2f \n", resultado);
                break;
            case 5:
                System.out.println("Olá querido usuario, Muito Obrigada! ");
                break;
        }
    }while (opcao != 5);

        }
    }


