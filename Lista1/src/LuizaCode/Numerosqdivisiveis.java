package LuizaCode;

import java.util.Scanner;

public class Numerosqdivisiveis {

    public static void main(String[] args) {
        Scanner ndivisiveis = new Scanner(System.in);

        System.out.print("Olá Usuario informe um número: ");
        int numero = ndivisiveis.nextInt();

        System.out.print("Olá Usuario informe o número inicial : ");
        int numeroIncial = ndivisiveis.nextInt();

        System.out.print("Olá Usuario informe o número final: ");
        int numeroFinal = ndivisiveis.nextInt();

        int count;

        for (count = numeroIncial; count <= numeroFinal; count++){
            if (count % numero == 0){
                System.out.printf("O numero %d é divisivel por %d \n ", count, numero);
            }
        }

    }
}
