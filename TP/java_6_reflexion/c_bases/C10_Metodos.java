package c_bases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C10_Metodos {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> c = Class.forName("c_bases.Triangulo");
        Method[] ms = c.getDeclaredMethods();

        for (Method m : ms) {
            System.out.println(m.getName());
            for (Class<?> param : m.getParameterTypes())
                System.out.println("  " + param.getName());
        }

        Method m = c.getMethod("area", double.class, double.class);
        System.out.println("Valor de retorno para area(double,double): " + m.getReturnType());

        System.out.println(m.invoke(new Triangulo(), 8.5, 4.96));
    }
}