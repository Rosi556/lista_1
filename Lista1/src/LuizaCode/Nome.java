package LuizaCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nome {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("1-- Tainá");
        nomes.add("2-- Stellinha");
        nomes.add("3-- Tequilinha");
        nomes.add("4-- Pituzinho");
        nomes.add("5-- Andrea");

        System.out.println("Lista de nomes:\n");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Digite o código do nome que deseja excluir:\n");
        Scanner entradaUsuario = new Scanner(System.in);
        int codigo = entradaUsuario.nextInt();


        if (codigo == 1) {
            nomes.remove(0);
        } else if (codigo == 2) {
            nomes.remove(1);
        } else if (codigo == 3) {
            nomes.remove(2);
        } else if (codigo == 4) {
            nomes.remove(3);
        } else if (codigo == 5) {
            nomes.remove(4);
        } else {
            System.out.println("Código inválido,tente novamente");
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

