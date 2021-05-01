package LuizaCode;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner lanche = new Scanner(System.in);

        System.out.print("Usuario informe o código do item: ");
        int item = lanche.nextInt();

        System.out.println("Usuario, informe a quantidade que deseja");
        int quantidade = lanche.nextInt();

        double valorTotal;

        switch (item) {
            case 100:
                valorTotal = quantidade * 1.20;
                System.out.printf("Ola, você solicitou o lanche cachorro quente o valor do seu pedido foi %.2f: ", valorTotal);
                break;
            case 101:
                valorTotal = quantidade * 1.30;
                System.out.printf("Ola, você solicitou o lanche bauru simples o valor do seu pedido foi %.2f: ", valorTotal);
                break;
            case 102:
                valorTotal = quantidade * 1.50;
                System.out.printf("Ola, você solicitou o lanche bauru com ovo o valor do seu pedido foi %.2f: ", valorTotal);
                break;
            case 103:
                valorTotal = quantidade * 1.20;
                System.out.printf("Ola, você solicitou o lanche hamburguer o valor do seu pedido foi %.2f: ", valorTotal);
                break;
            case 104:
                valorTotal = quantidade * 1.30;
                System.out.printf("Ola, você solicitou o lanche cheeseburguer o valor do seu pedido foi %.2f: ", valorTotal);
                break;
            case 105:
                valorTotal = quantidade * 1.00;
                System.out.printf("Ola, você solicitou a bebida refrigerante o valor do seu pedido foi %.2f: ", valorTotal);
                break;
            default:
                System.out.println("Muito obrida e volte sempre!");

        }

    }
}
