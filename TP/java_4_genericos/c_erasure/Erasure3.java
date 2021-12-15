package c_erasure;

class TieneF {
    public void f() {
        System.out.println("TieneF.f()");
    }
}

class Z extends TieneF {}

class Manipulador<T extends TieneF> {
    private T obj;

    public Manipulador(T x) {
        obj = x;
    }

    // ¿Cómo se determina si un tipo tiene un método f()? Se requiere
    // polimorfismo de objetos: class Manipulador<T extends TieneF>() {...}
    public void manipular() {
        obj.f(); //error: problema de tipificación
    }
}

public class Erasure3 {
    public static void main(String[] args) {
        TieneF tf = new TieneF();
        Manipulador<Z> m = new Manipulador<>(new Z());
        m.manipular();
    }
}

// 1. Substituir el parámetro TieneF de la referencia m por el parámetro Z.
//    Observar lo que pasa. ¿Por qué hay error?
// 2. Asegurarse de que se pase al constructor un objeto de tipo Z.