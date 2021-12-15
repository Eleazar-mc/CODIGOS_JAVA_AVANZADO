package d_limites;

interface Gas {
    double getDensidad();
}

class Oxigeno implements Gas {
    public double getDensidad() {
        return 1.0;
    }
}

class Nitrogeno implements Gas {
    public double getDensidad() {
        return 1.5;
    }
}

class Atmosfera<T extends Gas> {
    T componente;

    Atmosfera(T componente) {
        System.out.println("Atmósfera de " + componente.getClass().getSimpleName());
        this.componente = componente;
    }

    public double getDensidad() {
        return componente.getDensidad();
    }
}

public class Limites1 {
    public static void main(String[] args) {
        Atmosfera<Gas> at = new Atmosfera<>(new Oxigeno());
        System.out.println(at.getDensidad());
        at = new Atmosfera<>(new Nitrogeno());
        System.out.println(at.getDensidad());
    }
}