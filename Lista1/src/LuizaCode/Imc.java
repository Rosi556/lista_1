package LuizaCode;

import java.util.Scanner;

public class Imc {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Usuario informe seu peso: ");
        float peso = in.nextFloat();

        System.out.println("Usuario informe sua altura:");
        float altura = in.nextFloat();

        float imc = peso / (altura*altura);
        System.out.format("Seu imc é? "+ imc);

    }
}

