package t5_polimorfismo;

class Figure {
    public void draw() {
    }
    public void erase() {
    }
}

class Circle extends Figure {
    public void draw() {
        System.out.println("Circle.draw()");
    }
    public void erase() {
        System.out.println("Circle.erase()");
    }
    public void move() {
        System.out.println("Circle.move()");
    }
}

class Square extends Figure {
    public void draw() {
        System.out.println("Square.draw()");
    }
    public void move() {
        System.out.println("Square.move()");
    }
}

class Triangle extends Figure {}

public class Figuras1 {
    public static void main(String[] args) {
        Figure f1 = new Circle(),
                f2 = new Square(),
                f3 = new Triangle(); // upcasting
        d(f1);
        d(f2);
        d(f3);
        ((Square)f2).move();
        ((Circle) f1).draw(); // downcasting
        f1.draw();
    }
    static void d(Figure f) {
        f.draw();
    }
}