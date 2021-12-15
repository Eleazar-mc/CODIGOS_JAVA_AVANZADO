package t5_polimorfismo;

abstract class Glyph {
    abstract void draw();
//    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() antes de draw()");
        draw();
        System.out.println("Glyph() después de draw()");
    }
}

class RoundGlyph extends Glyph {
    int radio = 1;
    RoundGlyph(int r) {
        radio = r;
        System.out.println("RoundGlyph(), radio = " + radio);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radio = " + radio);
    }
}

public class PolyConstructors3 {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}