package b_externalizacion;

import java.io.*;

class Cosa1 implements Externalizable {
    public Cosa1() {
        System.out.println("Cosa1()");
    }

    public void writeExternal(ObjectOutput salida) throws IOException {
        System.out.println("Cosa1.writeExternal()");
    }

    public void readExternal(ObjectInput entrada) throws IOException, ClassNotFoundException {
        System.out.println("Cosa1.readExternal()");
    }
}

class Cosa2 implements Externalizable {
    Cosa2() { //???
        System.out.println("Cosa2()");
    }

    public void writeExternal(ObjectOutput salida) throws IOException {
        System.out.println("Cosa2.writeExternal()");
    }

    public void readExternal(ObjectInput entrada) throws IOException, ClassNotFoundException {
        System.out.println("Cosa2.readExternal()");
    }
}

public class Cosas {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Construccion de objetos:");
        Cosa1 c1 = new Cosa1();
        Cosa2 c2 = new Cosa2();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\cosas.salida"));

        System.out.println("Salvando objetos:");
        oos.writeObject(c1);
        oos.writeObject(c2);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\cosas.salida"));

        System.out.println("Recuperando c1:");
        c1 = (Cosa1) ois.readObject();
        System.out.println("Recuperndo c2:");
        c2 = (Cosa2) ois.readObject();
        ois.close();
    }
}