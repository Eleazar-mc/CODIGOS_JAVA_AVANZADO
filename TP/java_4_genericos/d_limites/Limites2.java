package d_limites;

interface Solido {}

interface Brillo {}

class Carbono implements Solido, Brillo {
    public int dureza = 10;
}

class Quimica<CRISTAL extends Carbono & Brillo & Solido> {
    CRISTAL componente;

    Quimica(CRISTAL componente) {
        this.componente = componente;
    }

    public double getDureza() {
        return componente.dureza;
    }
}

class Diamante extends Carbono {}

public class Limites2 {
    public static void main(String[] args) {
        Quimica<Carbono> q = new Quimica<>(new Diamante());
        System.out.println(q.getDureza());
    }
}