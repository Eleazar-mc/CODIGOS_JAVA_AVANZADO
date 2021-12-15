package a_intro;

import java.util.*;

@SuppressWarnings("serial")
class VerificationException extends Exception {
}

class Normal {
    void servicio() throws VerificationException {
        System.out.println("Ejecución de servicio");
    }

    @Deprecated
    void obsoleto() {
        System.out.println("No utilizar más");
    }
}

class Redefinicion extends Normal {
    @Override
    void servicio() throws VerificationException {
        System.out.println("Ejecución mejorada");
    }

    @SafeVarargs
    // Not actually safe!
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        @SuppressWarnings("unused")
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }
}

public class M1_Predefinidas {
    public static void main(String[] args) throws VerificationException {
        Normal n = new Redefinicion();
        n.servicio();
        n.obsoleto();
    }
}