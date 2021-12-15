package t5_polimorfismo;

class StaticSuper {
    public static int a = 10;
    public int b = 9;

    public static String staticGet() {
        return "Base staticGet()";
    }
    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static int a = 1000;
    public int b = 999;

    public static String staticGet() {
        return "Derived staticGet()";
    }
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism5 {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
        System.out.println(sup.a);
        System.out.println(sup.b);
    }
}

// Agregar un campo de instancia idéntico, con diferente valor, en
// la súper clase y subclase. Dar salida en main() y observar el resultado