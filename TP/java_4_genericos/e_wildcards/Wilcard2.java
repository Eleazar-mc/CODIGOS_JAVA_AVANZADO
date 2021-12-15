package e_wildcards;

interface X {}

class Contenedor<T> {
    Contenedor(T x) {}
}

class Caja<T extends Cloneable & X> extends Contenedor<T> {
    Caja(T x) {
        super(x);
    }
}

class Punto implements Cloneable, X {}

class Demo implements X {}

public class Wilcard2 {
    public static void main(String[] args) {
		//Caja<X> c1 = new Caja<Punto>(new Punto());
		//Caja<Cloneable> c2 = new Caja<Punto>(new Punto());
        Caja<Punto> c3 = new Caja<>(new Punto());
        Caja<? extends Cloneable> c4 = new Caja<>(new Punto());
        Caja<? extends X> c5 = new Caja<>(new Punto());
		//Caja<? extends X> c5d = new Caja<>(new Demo());
		//Caja<? extends Cloneable & X> c6 = new Caja<Punto>(new Punto());
        Contenedor<Punto> c7 = new Caja<>(new Punto());
        Object c8 = new Caja<>(new Punto());
		//Object c9 = new Caja<>(new Demo());
    }
}