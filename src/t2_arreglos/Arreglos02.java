package t2_arreglos;

class Punto {}

class Circulo {
    Circulo(Punto p, int i) {}
    Circulo() {}
}

public class Arreglos02 {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        String[][] a2 = new String[10][5];
        Punto[][][] a3 = new Punto[5][5][4];
        Circulo[] a4 = { new Circulo(), new Circulo(), new Circulo(new Punto(), 5) };

        a1[5] = 80;
        a1[7] = "Java".length();
        a2[6][2] = "Java";
        a2[6][3] = new String("Objetos");
        a3[2][2][2] = new Punto();

        System.out.println(a1[5]);
        System.out.println(a1[7]);
        System.out.println(a2[6][2]);
        System.out.println(a2[6][3]);
        System.out.println(a3[2][2][2]);
        System.out.println(a4[2]);
        System.out.println(a4.length);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}