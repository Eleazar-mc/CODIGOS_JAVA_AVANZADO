package e_wildcards;

import java.util.*;

public class Wilcard4 {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        apples.add(new Johnny());
//        apples.add(new Fruit()); // Error
        System.out.println(apples.get(0));
    }

    public static void main(String[] args) {
        ArrayList<Fruit> a = new ArrayList<>();
        a.add(new Fruit());
        a.add(new Apple());
        a.add(new Orange());
        a.add(new Johnny());
        writeTo(a);
    }
}