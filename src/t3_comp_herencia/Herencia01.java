package t3_comp_herencia;

class CirculoColorHerencia extends Circulo {
    private String color = new String("Blanco");

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

public class Herencia01 {
    public static void main(String[] args) {
        CirculoColorHerencia cch = new CirculoColorHerencia();
        System.out.println(cch.getX());
        System.out.println(cch.getR());
        System.out.println(cch.getColor());
    }
}
