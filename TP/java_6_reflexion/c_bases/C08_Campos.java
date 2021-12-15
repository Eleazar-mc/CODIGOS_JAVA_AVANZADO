package c_bases;

import java.lang.reflect.Field;

public class C08_Campos {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Class<?> p = Persona.class;
        Field[] fs = p.getFields();
        for(Field f: fs)
            System.out.println(f + "\n");

        fs = p.getDeclaredFields();
        for(Field f: fs)
            System.out.println(f);

        Field f = p.getField("colorPiel");
        System.out.println(f.getName());
        System.out.println(f.getType());

        Persona per = new Persona("Cafés");
        Object obj = f.get(per);
        System.out.println("Color de piel: " + obj);
        System.out.println("Color de piel: " + per.colorPiel);

        f.set(per, "clara");
        System.out.println("Color de piel: " + per.colorPiel);
    }
}

//¿Qué pasa si un campo no es público?