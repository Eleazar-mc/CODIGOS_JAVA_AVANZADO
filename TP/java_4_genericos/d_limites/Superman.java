package d_limites;

interface Extraterrestre {
    default void demoler() {
        System.out.println("Demoliendo");
    }
}
interface Volador {
    default void viajar() {
        System.out.println("Viajando");
    }
}
class SuperHeroe implements Volador, Extraterrestre {
    void accion() {
        demoler();
        viajar();
    }
}
public class Superman<T extends Volador & Extraterrestre> {
    T sh;
    Superman(T sh) {
        this.sh = sh;
    }
    public static void main(String[] args) {
        Superman<SuperHeroe> s = new Superman<>(new SuperHeroe());
        System.out.println(s.sh);
    }
}