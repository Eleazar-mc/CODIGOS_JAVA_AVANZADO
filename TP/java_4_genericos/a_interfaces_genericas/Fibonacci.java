package a_interfaces_genericas;

public class Fibonacci implements Generator<Integer> {
    private int contador = 0;

    public Integer siguiente() {
        return fib(contador++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.print(gen.siguiente() + " ");
    }
}