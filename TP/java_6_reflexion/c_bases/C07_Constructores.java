package c_bases;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class C07_Constructores {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> c = Punto.class;
        Constructor<?>[] cs = c.getConstructors();
        for(Constructor<?> ctor: cs)
            System.out.println(ctor);

        cs = c.getDeclaredConstructors();
        for(Constructor<?> ctor: cs)
            System.out.println(ctor);

        Constructor<?> ctor = c.getConstructor(new Class[] { Punto.class } );
        Class<?>[] params = ctor.getParameterTypes();
        for(Class<?> k: params)
            System.out.println("=" + k);

        Punto p = Punto.class.getConstructor(double.class, double.class).newInstance(3.3, 4.4);
        System.out.println(p);
    }
}

// ¿Qué pasa si alguno de los contructores no es público?