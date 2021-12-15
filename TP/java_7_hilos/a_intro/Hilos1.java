package a_intro;

class HolaHilo implements Runnable {
    int i;

    @Override
    public void run() {
        while(true) {
            System.out.println("Hola: " + Thread.currentThread() + " " + i++);
            if(i == 50)
                break;
        }
    }
}

public class Hilos1 {
    public static void main(String[] args) {
        HolaHilo h = new HolaHilo();
        Thread t = new Thread(h);
        t.start();

        HolaHilo j = new HolaHilo();
        Thread u = new Thread(j);
        u.start();
    }
}
