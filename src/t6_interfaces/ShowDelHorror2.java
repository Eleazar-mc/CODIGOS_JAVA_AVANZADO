package t6_interfaces;

interface Monstruo {
    void amenaza();
}
interface MonstruoPeligroso extends Monstruo {
    void destruye();
}
interface Letal {
    void mata();
}
class Godzilla implements MonstruoPeligroso {
    public void amenaza() {}
    public void destruye() {}
}
interface Vampiro extends MonstruoPeligroso, Letal {
    void bebeSangre();
}
class VampiroMuyMalo implements Vampiro {
    public void amenaza() {}
    public void destruye() {}
    public void mata() {}
    public void bebeSangre() {}
}

public class ShowDelHorror2 {
    static void u(Monstruo b) {
        b.amenaza();
    }
    static void v(MonstruoPeligroso d) {
        d.amenaza();
        d.destruye();
    }
    static void w(Letal l) {
        l.mata();
    }
    public static void main(String[] args) {
        MonstruoPeligroso barney = new Godzilla();
        u(barney);
        v(barney);
        Vampiro dracula = new VampiroMuyMalo();
        u(dracula);
        v(dracula);
        w(dracula);
    }
}