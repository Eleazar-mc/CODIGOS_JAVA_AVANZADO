package c_generativa;

import java.lang.reflect.*;
import static java.lang.System.out;

class Oxigeno {
    public final int VALENCIA = Math.random() < 0.5 ? -2 : 4;
}

class MoleculaO<T> {
    T[] atms;

    @SafeVarargs
    MoleculaO(T... a) {
        atms = a;
    }

    void getComposicion() {
        for(T x: atms)
            out.println(x);
    }
}

public class Experimento2 {
    public static void main(String[] args) throws Exception {
        out.println("Creación de hidrógeno y oxígeno...");
        Class<?> h = Class.forName("c_generativa.Hidrogeno");
        Class<?> o = Class.forName("c_generativa.Oxigeno");
        Field vHid = h.getDeclaredField("VALENCIA");
        Field vOxi = o.getDeclaredField("VALENCIA");

        Hidrogeno h1 = (Hidrogeno)h.getDeclaredConstructor().newInstance();
        Hidrogeno h2 = (Hidrogeno)h.getDeclaredConstructor().newInstance();
        Oxigeno o1 = (Oxigeno)o.getDeclaredConstructor().newInstance();

        out.println("Valencia encontrada para hidrógeno 1: " + vHid.getInt(h1));
        out.println("Valencia encontrada para hidrógeno 2: " + vHid.getInt(h2));
        out.println("Valencia encontrada para oxígeno 1: " + vOxi.getInt(o1));

        if(vHid.getInt(h1) == 1 && vHid.getInt(h2) == 1 && vOxi.getInt(o1) == -2) {
            out.println("Creación de molécula...");
            new MoleculaO<Object>(h1, h2, o1).getComposicion();
        }
    }
}