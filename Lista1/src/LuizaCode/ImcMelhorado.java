package LuizaCode;

import java.util.Scanner;

public class ImcMelhorado {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Usuario informe seu peso: ");
        float peso = in.nextFloat();

        System.out.println("Usuario informe sua altura:");
        float altura = in.nextFloat();

        float imc = peso / (altura*altura);
        System.out.format("Seu imc é? "+ imc);

        if (imc <=19.1) {
            System.out.print("Muito abaixo do peso");
        } else if (imc > 19.1 && imc <=25.8) {
            System.out.print("Abaixo do peso!");
        } else if (imc > 25.8 && imc <= 27.3) {
            System.out.print(", Peso normal!");
        } else if (imc > 27.3 && imc <= 32.3) {
            System.out.print(", Acima do peso!");
        } else{
            System.out.print(", Obesidade grau I!");
        }
    }

}

