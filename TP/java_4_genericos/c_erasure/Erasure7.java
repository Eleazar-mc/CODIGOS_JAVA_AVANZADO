package c_erasure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

class X<T> {}

class Thing {
    protected ArrayList<Float> field1;
    public Map<String, Integer> field2;

    Thing(X<Double> p) {}

    public X<Integer> m(ArrayList<String> p) {
        return null;
    }
}

public class Erasure7 {
    public static void main(String[] args) {
        Field[] fields = Thing.class.getDeclaredFields();
        for(Field field: fields)
            System.out.println(field.toGenericString());

        Method[] methods = Thing.class.getDeclaredMethods();
        for(Method method: methods)
            System.out.println(method.toGenericString());
        for(Method method: methods)
            System.out.println(method.getGenericReturnType());

        Constructor<?>[] ctors = Thing.class.getDeclaredConstructors();
        for(Constructor<?> ctor: ctors)
            System.out.println(ctor.toGenericString());
    }
}