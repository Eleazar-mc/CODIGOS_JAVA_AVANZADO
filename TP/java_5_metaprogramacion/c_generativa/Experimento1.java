package c_generativa;

import java.lang.reflect.*;
import static java.lang.System.out;

class Hidrogeno {
    public final int VALENCIA = (int)(Math.random()*3) + 1;
}

class Molecula<T> {
    T[] atms;

    @SafeVarargs
    Molecula(T... a) {
        atms = a;
    }

    void getComposicion() {
        for(T x: atms)
            out.println(x);
    }
}

public class Experimento1 {
    public static void main(String[] args) throws Exception {
        out.println("Creación de hidrógeno...");
        Class<?> h = Class.forName("c_generativa.Hidrogeno");
        Field f = h.getDeclaredField("VALENCIA");

        Hidrogeno h1 = (Hidrogeno)h.getDeclaredConstructor().newInstance();
        Hidrogeno h2 = (Hidrogeno)h.getDeclaredConstructor().newInstance();

        out.println("Valencia encontrada para átomo 1: " + f.getInt(h1));
        out.println("Valencia encontrada para átomo 2: " + f.getInt(h2));

        if(f.getInt(h1) == 1 && f.getInt(h2) == 1) {
            out.println("Creación de molécula...");
            new Molecula<Hidrogeno>(h1, h2).getComposicion();
        }
    }
}