package c_erasure;

// El tipo T de una clase puede ser diferente
// al tipo T de un método o constructor
public class Erasure5<T> {
    private final int SIZE = 100;

    public void f(Object arg) {
//		if (arg instanceof T) {} // Error
//		T var = new T(); // Error
//		T[] array = new T[SIZE]; // Error
        T[] array = (T[]) new String[SIZE]; // Unchecked warning
        // Agregar un S.o.p para ver el tipo del arreglo;
    }
}

// 1) Cambiar el tipo del array a String
// 2) En un método main instanciar la clase
//    con Integer y ver lo que sucede