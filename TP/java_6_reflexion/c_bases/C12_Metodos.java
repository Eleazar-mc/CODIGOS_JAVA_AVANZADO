package c_bases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C12_Metodos {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ObjetoPrivado objPrivado = new ObjetoPrivado("Valor ultra protegido por encapsulación");

        Method metodoProv = ObjetoPrivado.class.getDeclaredMethod("getCadenaPrivada");

        metodoProv.setAccessible(true);

        String valorDeRetorno = (String)metodoProv.invoke(objPrivado);

        System.out.println("Valor de retorno = " + valorDeRetorno);
    }
}