package a_serializacion;
//5
import java.util.Date;
import java.io.*;

class LeeObjeto {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("C:\\work_others\\musica21.ito");
        ObjectInputStream ois = new ObjectInputStream(fis);

        String hoy = (String) ois.readObject();
        Date fecha = (Date) ois.readObject();
        Viento trompeta = (Viento) ois.readObject();
        SerializaObjeto serial = (SerializaObjeto)ois.readObject();
        ois.close();

        System.out.println(hoy + ": " + fecha);
        System.out.println("Instrumento trompeta: " + trompeta);
        trompeta.tocar();
        System.out.println(serial);
    }
}