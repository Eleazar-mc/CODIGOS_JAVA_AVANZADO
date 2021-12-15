package a_intro;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class M4_Extractor {
    public static void main(String[] args) {
        Class<M3_Componente> k = M3_Componente.class;

        for (Annotation a : k.getAnnotations())
            System.out.println("Se encontró una anotación de clase: " + a);

        for (Field f : k.getDeclaredFields())
            for (Annotation a : f.getAnnotations())
                System.out.println("Se encontró una anotación de campo: " + a);

        for (Method m : k.getDeclaredMethods()) {
            for (Annotation a : m.getAnnotations())
                System.out.println("Se encontró una anotación de método: " + a);
            Annotation[][] p = m.getParameterAnnotations();
            for (int i = 0; i < p.length; i++)
                for (int j = 0; j < p[i].length; j++)
                    System.out.println("... y anotación de parámetro: " + p[i][j]);
        }

        for (Constructor<?> c : k.getDeclaredConstructors())
            for (Annotation a : c.getAnnotations())
                System.out.println("Se encontró una anotación de constructor: " + a);

        System.out.println("INTERNAS:");
        for (Class<?> inner : k.getDeclaredClasses()) {
            System.out.println(inner.getName());
            for (Annotation a : inner.getAnnotations())
                System.out.println("Se encontró una anotación de clase: " + a);
        }
    }
}