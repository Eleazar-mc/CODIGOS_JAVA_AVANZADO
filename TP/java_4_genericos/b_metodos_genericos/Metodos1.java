package b_metodos_genericos;

public class Metodos1 {
    public <T> void m(T x) {
        System.out.println(x.getClass().getName());
    }

    public <T,U,V> void v(T a, U b, V c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public <T,V> void vp(T a, int b, V c) {
        System.out.println(a.getClass().getName());
        System.out.println(b);
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {
        Metodos1 met = new Metodos1();
        met.m("");
        met.m(1);
        met.m(1.0);
        met.m(1.0f);
        met.m('c');
        met.m(met);

        met.v("", 5, met);
        met.v(1, (short)9, 8.8);

        met.vp("", 5, met);
        met.vp(1, 9, 8.8);
    }
}