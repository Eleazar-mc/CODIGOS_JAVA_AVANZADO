package t2_arreglos;

import static java.lang.System.out;
import java.util.Random;

public class Arreglos01 {
    static Random rand = new Random();

    public static void main(String[] args) {
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("Longitud de a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500);
            System.out.println("a[" + i + "] = " + a[i]);
        }

        Integer aa = 7; //boxing
        out.println(aa);
        aa = 99;
        out.println(aa);
        int h = aa; //unboxing
        out.println(h);
    }
}
