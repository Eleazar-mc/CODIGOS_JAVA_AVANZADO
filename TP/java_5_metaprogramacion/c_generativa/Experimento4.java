package c_generativa;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.io.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ExponerCampo {
    public String codigo() default "no";
    public int valor() default 0;
}

class ClaseGenerativa {
    @ExponerCampo(codigo = "protected int x", valor = 10)
    int x = 10;
}

public class Experimento4 {
    private static String createClassDef(String nameClass, String field) {
        String openClass = "public class " + nameClass + " {";
        String methodDef = "void m() { System.out.println(\"¡Incubado 26/05/2021!\");}";
        String closeClass = "}";
        return openClass + field + methodDef + closeClass;
    }
    private static void createAndCompileClassFile(String code, String name) throws IOException {
        String archivo = "C:\\work_ides\\IntelliJ\\TP\\out\\production\\java_5_metaprogramacion\\c_generativa\\" + name + ".java";
        FileWriter fw = new FileWriter(new File(archivo));
        fw.write(code);
        fw.close();
        System.out.println("Compilando " + name + ".java");
        com.sun.tools.javac.Main.compile(new String[] { "-g", archivo });
    }
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("c_generativa.ClaseGenerativa");
        Field f = c.getDeclaredField("x");
        ExponerCampo cg = f.getAnnotation(ExponerCampo.class);

        StringBuilder sb = new StringBuilder();
        if(cg != null) {
            sb.append(cg.codigo());
            sb.append("=");
            sb.append(cg.valor());
            sb.append(";");
        }
        createAndCompileClassFile(createClassDef("Generado", sb.toString()), "Generado");

        Class<?> k = Class.forName("Generativa");
        Field g = k.getDeclaredField("x");
        Method m = k.getDeclaredMethod("m");
        System.out.println(g);
        Object ref = k.newInstance();
        System.out.println(ref.getClass().getName());
        m.setAccessible(true);
        m.invoke(ref);
    }
}