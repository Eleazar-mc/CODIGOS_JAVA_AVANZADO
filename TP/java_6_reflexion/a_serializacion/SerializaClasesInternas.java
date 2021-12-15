package a_serializacion;
//8
import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Externa implements Serializable {
    private static final long serialVersionUID = 1L;

    class Interna {}
}

class Externa2 {
    class Interna implements Serializable {
        private static final long serialVersionUID = 1L;
    }
}

class Externa3 implements Serializable {
    private static final long serialVersionUID = 1L;

    class Interna implements Serializable {
        private static final long serialVersionUID = 1L;
    }
}

public class SerializaClasesInternas {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*Externa.Interna ei = new Externa().new Interna();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\caso1.serial"));
		oos.writeObject(ei);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\work_others\\caso1.serial"));
		Externa.Interna eiRec = (Externa.Interna)ois.readObject();
		out.println(eiRec);
		ois.close();

		/*Externa2.Interna ei2 = new Externa2().new Interna();
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\caso2.serial"));
		oos2.writeObject(ei2);
		oos2.close();

		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("C:\\work_others\\caso2.serial"));
		Externa2.Interna eiRec2 = (Externa2.Interna)ois2.readObject();
		out.println(eiRec2);
		ois2.close();*/

        Externa3.Interna ei3 = new Externa3().new Interna();
        ObjectOutputStream oos3 = new ObjectOutputStream(new FileOutputStream("C:\\work_others\\caso3.serial"));
        oos3.writeObject(ei3);
        oos3.close();

        ObjectInputStream ois3 = new ObjectInputStream(new FileInputStream("C:\\work_others\\caso3.serial"));
        Externa3.Interna eiRec3 = (Externa3.Interna)ois3.readObject();
        out.println(eiRec3);
        ois3.close();
    }
}