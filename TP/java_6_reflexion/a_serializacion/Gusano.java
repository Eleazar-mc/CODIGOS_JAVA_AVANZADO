package a_serializacion;
//7
import java.io.*;

class UnDato implements Serializable {
    private static final long serialVersionUID = 1L;
    private int i;

    UnDato(int x) {
        i = x;
    }

    @Override public String toString() {
        return Integer.toString(i);
    }
}

public class Gusano implements Serializable {
    private static final long serialVersionUID = 1L;

    private UnDato[] d = { new UnDato(30), new UnDato(15), new UnDato(7) };

    Gusano() {
        System.out.println("Gusano()");
    }

    Gusano(int i) {
        System.out.println("Gusano(int): " + i);
    }

    @Override public String toString() {
        String s = "(";
        for (int i = 0; i < d.length; i++)
            s += ":" + d[i].toString();
        s += ")";
        return s;
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Gusano g = new Gusano(5);
        System.out.println("g = " + g);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\gusano21.out"));
        oos.writeObject("Almacenaje de Gusano");
        oos.writeObject(g);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\gusano21.out"));
        String s = (String) ois.readObject();
        Gusano g2 = (Gusano) ois.readObject();
        ois.close();
        System.out.println(s + ", g2 = " + g2);
        System.out.println(g2.d[1]);
    }
}