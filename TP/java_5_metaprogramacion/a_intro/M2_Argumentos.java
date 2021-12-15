package a_intro;

@interface Meal {
}

interface House {
    @Deprecated
    void open();

    void openFrontDoor();

    @Meal
    void openBackDoor();
}

class MyHouse implements House {
    @Override
    public void open() {
    }

    @Override
    public void openFrontDoor() {
    }

    @Override
    @Meal
    public void openBackDoor() {
    }
}

@Meal
class Demo {
    public void m1(int[] a) {
        for (int x : a)
            System.out.println(x);
    }

    public void m2(int... a) { //lista de argumentos de longitud variable: varargs
        for (int x : a)
            System.out.println(x);
    }
}

public class M2_Argumentos {
    public static void main(@Meal String[] args) {
        @Meal Demo demo = new Demo();

        demo.m1(new int[]{1, 4, 3, 2, 1});
        int[] arreglo = {9, 8, 7, 8, 9, 9, 8, 7};
        demo.m1(arreglo);
        demo.m1(null);

        demo.m2(88, 100, 99); //cualquier cantidad de enteros, incluso ninguno
        demo.m2();
        demo.m2(null);

        MyHouse h = new MyHouse();
        h.open();
    }
}