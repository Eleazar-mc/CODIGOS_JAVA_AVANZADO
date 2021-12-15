package t4_proceso;

import static java.lang.System.out;

class Componente {
	static {
		out.println("C");
	}
	{
		out.println("ente");
	}
	Componente(int x) {
		out.println("Componente: " + x);
	}
}

class Parte1 extends Componente {
	Componente c2 = new Componente(33);
	{
		out.println("shhh");
	}
	Componente c1 = new Componente(-4);
	Parte1() {
		super(22);
	}
}

public class Proceso4 extends Componente {
	static Componente c = new Componente(19);
	Proceso4() {
		super(100);
		out.println("¡bye!");
		new Componente(5);
	}
	public static void main(String[] args) {
		out.println(c);
		new Proceso4();
	}
	static {
		out.println("Hola");
	}
	{
		out.println("adios");
	}
}