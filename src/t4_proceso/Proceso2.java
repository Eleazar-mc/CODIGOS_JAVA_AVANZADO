package t4_proceso;

import static java.lang.System.out;

class Avion {
	static { out.println("Volando"); }
	void volar() {
		out.println("Volando más rápido");
	}
	{ out.println("Avion..."); }
	static String s = "Boeing";
}
class Aeropuerto {
	Avion a1 = new Avion();
	static Avion a2;
	{
		out.println("Armando un avión más");
		a2 = new Avion();
	}
}
public class Proceso2 {
	static { out.println("Ensamblaje de aviones"); }
	Avion x = new Avion();
	public static void main(String[] args) {
		new Avion().volar();
	}
	static { out.println(Avion.s); }
}