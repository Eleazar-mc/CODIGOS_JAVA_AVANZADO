package t4_proceso;

import static java.lang.System.out;

class Game {
    Game() {
        out.println("Game constructor");
    }
    static {
        out.println("Game class");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        out.println("BoardGame constructor");
    }
    static {
        out.println("BoardGame class");
    }
}

public class Chess1 extends BoardGame {
    static {
        out.println("Chess class");
    }
    Chess1() {
        super(11);
        out.println("Chess constructor");
    }

    public static void main(String[] args) {
        new Chess1();
    }
}


/*
 * 1. Búsqueda de clases mediante el Classpath (Válido para Java <= 1.8)
 * 2. Reserva de memoria para la clase
 * 3. Campos estáticos - valores default
 * 4. Campos estáticos - valores explícitos
 * 5. Bloques estáticos

 * 6. Reserva de memoria para el objeto
 * 7. Campos de instancia - valores default
 * 8. Campos de instancia - valores explícitos
 * 9. Bloques de instancia
 * 10.Ejecución de los constructores
 */

/*
c:\empresa\sistema1\com\logica\Principal.class
CLASSPATH = c:\empresa\sistema1;.

c:\empresa\sistema1\App.jar
CLASSPATH = c:\empresa\sistema1\App.jar
*/











