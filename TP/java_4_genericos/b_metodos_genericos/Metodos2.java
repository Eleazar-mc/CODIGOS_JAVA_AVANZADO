package b_metodos_genericos;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
    public static <T> ArrayList<T> list() {
        return new ArrayList<T>();
    }

    public static void m(ArrayList<String> s) {}
    public static void m2(ArrayList<Object> s) {}

    public static void main(String[] args) {
        List<Float> lista = Metodos2.list();
        lista.add(12.34f);
        lista.add(-0.0004f);
        System.out.println(lista);

        System.out.println(Metodos2.list());
        Metodos2.m(Metodos2.<String>list()); //Inferencia de tipos solo en asignaciones (sólo para Java 7)
        Metodos2.m2(Metodos2.list()); //OK, por default Object
    }
}