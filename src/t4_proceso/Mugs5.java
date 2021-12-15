package t4_proceso;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs5 {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    Mugs5() {
        System.out.println("Mugs()");
    }
    Mugs5(int i) {
        System.out.println("Mugs(int)");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs5();
        System.out.println("new Mugs() completed");
        new Mugs5(1);
        System.out.println("new Mugs(1) completed");
    }
}

// Asignar un objeto a mug1 y mover la línea 13 al final del bloque