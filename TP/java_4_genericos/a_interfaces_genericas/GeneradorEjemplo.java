package a_interfaces_genericas;

class Perro {
    public String toString() {
        return getClass().getSimpleName();
    }
}

class Doberman extends Perro {}
class Bulldog extends Perro {}
class Pequinez extends Perro {}

public class GeneradorEjemplo implements Generator<Perro> {
    private Class<?>[] p = { Doberman.class, Bulldog.class, Pequinez.class };

    public Perro siguiente() {
        Perro m = null;
        try {
            m = (Perro) p[(int)(Math.random()*3)].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return m;
    }

    public static void main(String[] args) {
        GeneradorEjemplo e = new GeneradorEjemplo();
        System.out.println(e.siguiente());
        System.out.println(e.siguiente());
        System.out.println(e.siguiente());
    }
}