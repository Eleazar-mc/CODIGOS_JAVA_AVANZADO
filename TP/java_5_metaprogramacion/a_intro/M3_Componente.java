package a_intro;

@AnotacionInterfaz
interface Contrato {
}

@AnotacionClase
@AnotacionInterfaz
public class M3_Componente implements Contrato {
    @AnotacionConstructor
    public M3_Componente() {
        System.out.println("Componente()");
    }

    @AnotacionCampo
    private int campo = 10;

    @AnotacionMetodo
    public int getCampo(@AnotacionParametro int z) {
        return campo + z;
    }

    @AnotacionClase
    public class Interna {
    }
}