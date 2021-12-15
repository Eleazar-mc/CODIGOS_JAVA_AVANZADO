package a_serializacion;
//6
import java.io.*;

class A implements Serializable {
    private static final long serialVersionUID = 1L;
    int i = 30;
}

class B extends A {
    private static final long serialVersionUID = 1L;
    int j = 29;
}

class Herencia extends B {
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Herencia h = new Herencia();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\h21.out"));
        oos.writeObject(h);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\h21.out"));
        Herencia h2 = (Herencia) ois.readObject();
        ois.close();
        System.out.println(h2.i);
        System.out.println(h2.j);
    }
}