package t1_referencias;

import static java.lang.System.out;

public class Referencias01 {
    public static void main(String[] args) {
        String l1 = "Hola"; //literal
        String l2 = "Hola";

        out.println(l1 == l2);
        out.println(l1.equals(l2));

        String o1 = new String("Hola"); //objeto
        String o2 = new String("Hola");

        out.println(o1 == o2);
        out.println(o1.equals(o2));
    }
}