package a_serializacion;
//4
import java.util.Date;
import java.io.*;

class Instrumento implements Serializable {
    private static final long serialVersionUID = 1L;
}

class Viento extends Instrumento implements Serializable {
    private static final long serialVersionUID = 1L;

    void tocar() {
        System.out.println("Tocando");
    }
}

class SerializaObjeto implements Serializable {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\work_others\\musica21.ito");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject("Dia de hoy");
        oos.writeObject(new Date());
        oos.writeObject(new Viento());
        oos.writeObject(new SerializaObjeto());
        oos.flush();
        oos.close();
    }
}