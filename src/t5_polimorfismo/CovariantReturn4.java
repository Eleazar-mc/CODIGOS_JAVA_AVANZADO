package t5_polimorfismo;

class Grain {
    public String toString() {
        return "Grain";
    }
}
class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}
class Mill {
    Grain process() {
        return new Grain();
    }
    Object process2() {
        return 7.7;
    }
}
class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
    String process2() {
        return null;
    }
}
public class CovariantReturn4 {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}