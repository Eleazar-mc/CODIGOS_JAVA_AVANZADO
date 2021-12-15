package t4_proceso;

import static java.lang.System.out;

class Tag {
    Tag(int marker) {
        out.println("Tag(" + marker + ")");
    }
}

class Card {
    Tag t1 = new Tag(1);
    Card() {
        out.println("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);

    void f() {
        out.println("f()");
    }
    Tag t3 = new Tag(3);
}

public class OrderOfInitialization2 {
    public static void main(String[] args) {
        Card t = new Card();
        t.f();
    }
}