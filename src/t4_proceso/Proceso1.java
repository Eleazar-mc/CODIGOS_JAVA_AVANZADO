package t4_proceso;

import static java.lang.System.out;

class Jamon {
	Jamon() { out.println("Jamon()"); }
}
class Queso {
	Queso() { out.println("Queso()"); }	
}
class Lechuga {
	Lechuga() { out.println("Lechuga()"); }	
	static { out.println("Lechuga.<clinit>"); }
}
class Pan {
	{ out.println("Un pan"); }
}
class Rebanada extends Pan {
	static { out.println("Rebanando..."); }
}
class ComidaRapida {
	static { out.println("Tengo prisa"); }
	{ out.println("Preparando..."); }
}
class Sandwich extends ComidaRapida {
	Lechuga le = new Lechuga();
	Queso q1 = new Queso();
	Jamon j = new Jamon();
	Queso q2 = new Queso();
	Sandwich() { out.println("�Listo!"); }
}
public class Proceso1 {
	public static void main(String[] args) {
		new Sandwich();
	}
	static Pan p = new Pan();
}