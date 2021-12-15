package a_intro;

class HolaHilo2 extends Thread {
    int i;

    @Override
    public void run() {
        while(true) {
            System.out.println("Hola: " + Thread.currentThread() + " " + i++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 50)
                break;
        }
    }
}

public class Hilos2 {
    public static void main(String[] args) {
        HolaHilo2 h = new HolaHilo2();
        h.start();

        HolaHilo2 j = new HolaHilo2();
        j.start();
    }
}
