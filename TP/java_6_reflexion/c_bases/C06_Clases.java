package c_bases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class C06_Clases {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1 = ContieneTodo.class;
        Class<?> c2 = Class.forName("c_bases.ContieneTodo");

        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());

        System.out.println(c2.getPackage());
        System.out.println(c2.getSuperclass());

        for(Class<?> i: c2.getInterfaces())
            System.out.println(i);
        for(Constructor<?> c: c2.getConstructors())
            System.out.println(c);
        for(Method m: c2.getDeclaredMethods())
            System.out.println(m);
        for(Field f: c2.getDeclaredFields())
            System.out.println(f);

        int modificadores = c1.getModifiers();

        System.out.println(Modifier.isAbstract(modificadores));
        System.out.println(Modifier.isFinal(modificadores));
        System.out.println(Modifier.isInterface(modificadores));
        System.out.println(Modifier.isNative(modificadores));
        System.out.println(Modifier.isPrivate(modificadores));
        System.out.println(Modifier.isProtected(modificadores));
        System.out.println(Modifier.isPublic(modificadores));
        System.out.println(Modifier.isStatic(modificadores));
        System.out.println(Modifier.isStrict(modificadores));
        System.out.println(Modifier.isSynchronized(modificadores));
        System.out.println(Modifier.isTransient(modificadores));
        System.out.println(Modifier.isVolatile(modificadores));
    }
}

// Hacer lo mismo para una interfaz