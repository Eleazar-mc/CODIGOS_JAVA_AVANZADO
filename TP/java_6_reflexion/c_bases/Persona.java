package c_bases;

public class Persona {
    private int edad;
    protected String nombre;
    protected char genero;
    public final String colorOjos;
    public String colorPiel = "morena";

    public Persona(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}