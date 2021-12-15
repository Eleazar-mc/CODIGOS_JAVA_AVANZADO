package c_bases;

public class ContieneTodo implements I {
    private int campo = 99;

    public int getCampo() {
        return campo;
    }
    public void setCampo(int campo) {
        this.campo = campo;
    }

    public ContieneTodo() {
        System.out.println("Sin argumentos");
    }
}