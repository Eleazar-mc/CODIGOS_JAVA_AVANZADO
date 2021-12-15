package t6_interfaces;

interface PuedePelear {
    void pelear();
}

interface PuedeNadar {
    void nadar();
}

interface PuedeVolar {
    void volar();
}

class Accion {
    public void pelear() {
    }
}

class Heroe extends Accion implements PuedePelear, PuedeNadar, PuedeVolar {
    public void nadar() {
    }

    public void volar() {
    }
}

public class Aventura1 {
    public static void t(PuedePelear x) {
        x.pelear();
    }

    public static void u(PuedeNadar x) {
        x.nadar();
    }

    public static void v(PuedeVolar x) {
        x.volar();
    }

    public static void w(Accion x) {
        x.pelear();
    }

    public static void main(String[] args) {
        Heroe h = new Heroe();
        t(h);
        u(h);
        v(h);
        w(h);
        PuedeVolar pv = h; // upcasting
        Accion a = h;

        PuedeNadar n = ((Heroe)a);
    }
}

// ¿Cómo asignar la referencia a a un tipo t6_interfaces.PuedeNadar?