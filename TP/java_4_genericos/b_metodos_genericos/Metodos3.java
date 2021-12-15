package b_metodos_genericos;

import java.util.*;

public class Metodos3 {
    @SafeVarargs
    public static <T> List<T> hacerLista(T... params) {
        List<T> resultado = new ArrayList<T>();
        for(T elemento: params)
            resultado.add(elemento);
        return resultado;
    }

    public static void main(String[] args) {
        List<String> ls = hacerLista("A");
        System.out.println(ls);
        ls = hacerLista("A", "B", "C");
        System.out.println(ls);
        ls = hacerLista("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}