package t4_proceso;

class Atomo {
	{ System.out.println("Atomo.expulsión"); }
	Atomo(int a) {
		System.out.println("Atomo(" + a + ")");
	}
	void m(int a) {
		System.out.println("m(" + a + ")");
	}
	{ System.out.println("Atomo.iniciación"); }
}

class Elemento {
	static Atomo a1 = new Atomo(1);
	Elemento() {
		System.out.println("Elemento()");
		a2.m(1);
	}
	void p(int a) {
		System.out.println("p(" + a + ")");
	}
	static Atomo a2 = new Atomo(2);
}

class Molecula {
	Atomo a1 = new Atomo(3);
	static Atomo a2 = new Atomo(4);
	Molecula() {
		System.out.println("Molecula()");
		a2.m(2);
	}
	void q(int a) {
		System.out.println("q(" + a + ")");
	}
	static Atomo a3 = new Atomo(5);
}

class Complejo {
	Complejo() {
		System.out.println("Complejo()");
	}
	{ System.out.println("Pre-Complejo"); }
	static { System.out.println("Complejo maestro"); }
}

public class Quimica extends Complejo {
	static Molecula molecula = new Molecula();
	Quimica() {
		System.out.println("Quimica()");
	}
	public static void main(String[] args) {
		new Molecula();
		new Molecula();
		e.p(1);
		molecula.q(1);
		new Quimica();
		System.out.println("Reacción de terminación");
	}
	static Elemento e = new Elemento();
}