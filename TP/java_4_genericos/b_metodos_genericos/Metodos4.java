package b_metodos_genericos;

import a_interfaces_genericas.Generator;

public class Metodos4 {
    private static long counter = 1;
    private final long id = counter++;

    private Metodos4() {}

    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Metodos4> generator() {
//		return new Generator<Metodos4>() {
//			public Metodos4 siguiente() {
//				return new Metodos4();
//			}
//		};

//		return () -> new Metodos4();

        return Metodos4::new;
    }

    public static void main(String[] args) {
        System.out.println(generator().siguiente());
        System.out.println(generator().siguiente());
        System.out.println(generator().siguiente());
    }
}