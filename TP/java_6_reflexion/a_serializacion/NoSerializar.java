package a_serializacion;
//9
import java.io.*;

class NoSerializar implements Serializable {
    private static final long serialVersionUID = 1L;
    String materia = new String("Programacion Orientada a Objetos");
    transient String lenguaje = new String("Java");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        NoSerializar ns = new NoSerializar();
        System.out.println(ns.materia);
        System.out.println(ns.lenguaje);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\noserial.out"));
        oos.writeObject(ns);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\noserial.out"));
        NoSerializar ns2 = (NoSerializar) ois.readObject();
        ois.close();
        System.out.println(ns2.materia);
        System.out.println(ns2.lenguaje);
    }
}

// ¿Qué función tiene la palabra reservada "transient"?