package t4_proceso;

class K {
	static {
		System.out.println("K.<clinit>");
	}
}

interface I {
	K c = new K();
}

public class Proceso5 {
	public static void main(String[] args) {
//		System.out.println("Proceso5.main()");
//		System.out.println(c);
		
		System.out.println(I.c);
	}
}