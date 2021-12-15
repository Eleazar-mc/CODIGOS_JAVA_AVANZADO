package c_erasure;

import java.util.*;

public class Erasure1 {
    public static void main(String[] args) {
        //¿ArrayList<String> es diferente a ArrayList<Integer>?
        Class<?> c1 = new ArrayList<String>().getClass();
        Class<?> c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}