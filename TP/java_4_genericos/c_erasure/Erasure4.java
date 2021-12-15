package c_erasure;

class GenericBase<T> {
    private T element;

    public void set(T arg) {
        element = arg;
    }

    public T get() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T> {}

@SuppressWarnings("rawtypes")
class Derived2 extends GenericBase {}

//class Derived3 extends GenericBase<T> {}

public class Erasure4 {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        //System.out.println(d2.get().getClass());
        Object obj = d2.get();
        d2.set(obj);
    }
}

// ¿Cuál es el tipo de dato de la versión no parametrizada?