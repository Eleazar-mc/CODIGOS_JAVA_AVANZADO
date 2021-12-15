package t3_comp_herencia;

class Punto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}

class Circulo {
    private Punto c = new Punto();
    private double r = 1;

    public Punto getC() {
        return c;
    }
    public void setC(Punto c) {
        this.c = c;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getX() {
        return c.getX();
    }
    public void setX(double x) {
        c.setX(x);
    }
}

class CirculoColor {
    private Circulo circulo = new Circulo();
    private String color = new String("Verde");

    public Circulo getCirculo() {
        return circulo;
    }
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getX() {
        return circulo.getX();
    }
    public void setX(double x) {
        circulo.setX(x);
    }
}

public class Composición01 {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        System.out.println(c.getX());
        System.out.println(c.getC().getX());

        CirculoColor cc = new CirculoColor();
        System.out.println(cc.getColor());
    }
}
