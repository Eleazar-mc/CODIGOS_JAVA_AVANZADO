package c_bases;

import java.lang.reflect.Method;

public class C05_Metodos {
    public static void main(String[] args) {
        Method[] methods = C01_HolaMundo.class.getMethods();
        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }

        System.out.println();

        methods = C02_SubHolaMundo.class.getMethods();
        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }
    }
}