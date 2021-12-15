package a_interfaces_genericas;

import java.util.ArrayList;
import java.util.List;

public class Clecciones {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Hola");
        lista.add(new Object());
        lista.add(8);
        System.out.print(lista);

        List<Integer> lista2 = new ArrayList<Integer>();
//        lista2.add("Hola");
//        lista2.add(new Object());
        lista2.add(8);
        System.out.print(lista2);
    }
}
