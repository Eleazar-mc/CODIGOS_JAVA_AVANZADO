package a_serializacion;
//3
import java.io.*;

public class RecuperaExtraterrestre {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\x21.file"));

        Object misterio = ois.readObject();
        System.out.println(ois.getClass());
        System.out.println(misterio.getClass());
        ois.close();
    }
}

// Mostrar el campo del Extraterrestre