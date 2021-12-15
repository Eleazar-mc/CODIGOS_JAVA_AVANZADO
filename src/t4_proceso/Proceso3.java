package t4_proceso;

import static java.lang.System.out;

class A {
	int x = 5;
	{
		out.println("A.<init>: " + x);
	}
	int y = 7;
	
	static int xs = 5;
	static {
		out.println("A.<clinit>: " + xs);
	}
	static int ys = 7;
}

class B extends A {
	A a = new A();
	B() {
		out.println(new A());
	}
}

interface X {
	int z = 4;
}

public class Proceso3 extends B implements X {
	{
		out.println("Nuevo proceso.");
	}
	public static void main(String[] args) {
		m();
		out.println(new B());
		new Proceso3();
	}
	static {
		out.println("OK");
	}
	{
		out.println("Proceso en ejecución");
	}
	static void m() {
		out.println("Valor: " + z);
	}
}