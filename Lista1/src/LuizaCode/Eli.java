package LuizaCode;

import java.util.ArrayList;
import java.util.List;

public class Eli {

    public static void main(String[] args) {

        //criando o objeto coisas do tipo List

        List valores = new ArrayList();

        //cadastrando valores na lista

        valores.add("Rosicleite");
        valores.add(2);
        valores.add("I");
        valores.add(2.55);
        valores.add("2.55");
        valores.add(1);
        valores.add(100);
        valores.add("C");
        valores.add(1.00011001);
        valores.add("5");

        for(Object valor: valores) {
            System.out.println(valor);
        }



    }
}
