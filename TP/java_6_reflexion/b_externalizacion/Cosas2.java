package b_externalizacion;

import java.io.*;

public class Cosas2 implements Externalizable {
    int i;
    String s;

    public Cosas2() {
        System.out.println("Cosa2()");
    }

    public Cosas2(String x, int a) {
        System.out.println("Cosa2(String, int)");
        s = x;
        i = a;
    }

//	@Override public String toString() {
//		return s + i;
//	}

    public void writeExternal(ObjectOutput salida) throws IOException {
        System.out.println("Cosa2.writeExternal()");
        salida.writeObject(s);
        salida.writeInt(i);
    }

    public void readExternal(ObjectInput entrada) throws IOException, ClassNotFoundException {
        System.out.println("Cosa2.readExternal()");
        s = (String) entrada.readObject();
        i = entrada.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Construyendo objetos:");
        Cosas2 c3 = new Cosas2("Una cadena ", 29);
        System.out.println(c3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\cosa3.salida"));
        System.out.println("Salvando objeto:");
        oos.writeObject(c3);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\cosa3.salida"));
        System.out.println("Recuperando c3:");
        c3 = (Cosas2) ois.readObject();
        System.out.println(c3);
        ois.close();
    }
}