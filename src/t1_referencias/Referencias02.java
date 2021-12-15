package t1_referencias;

class Valor {
    int a = 7;
}

class Aliasing {
    Valor x1 = new Valor();
    Valor x2 = new Valor();

    public void ejecutar() {
        x1.a = 5;
        x2.a = 1;

        System.out.println(x1.a);
        System.out.println(x2.a);

        x1 = x2; // aliasing

        System.out.println(x1.a);
        System.out.println(x2.a);
    }
}

public class Referencias02 {
    public static void main(String... args) {
        new Aliasing().ejecutar();
    }
}