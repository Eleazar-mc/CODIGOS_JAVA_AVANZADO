package c_bases;

import java.lang.reflect.Field;

public class C09_Campos {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        ObjetoPrivado priv = new ObjetoPrivado("Valor privado, no debe verse para nada");

        Field campoPrivado = ObjetoPrivado.class.getDeclaredField("privado");

        // Suprime la verificación de acceso.
        // Sólo para propóstios de reflection.
        campoPrivado.setAccessible(true);

        String valorDelCampo = (String) campoPrivado.get(priv);
        System.out.println("¡Valor del campo privado! = " + valorDelCampo);
    }
}

// ¿Es posible cambiar el valor de un campos privado?
// Consultar en la API