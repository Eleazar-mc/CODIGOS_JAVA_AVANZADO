package a_serializacion;
//2
import java.io.*;

public class ConservaExtraterrestre {
    public static void main(String[] args) throws IOException {
        ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\x21.file"));

        Extraterrestre et = new Extraterrestre();
        oo.writeObject(et);

        oo.close();
    }
}

// ¿Puede un programa en otra máquina reconstruir
// el objeto usando sólo el contenido del archivo?