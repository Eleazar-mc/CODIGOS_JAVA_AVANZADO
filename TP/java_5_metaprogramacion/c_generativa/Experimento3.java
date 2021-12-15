package c_generativa;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.io.*;

class NoGenerativa {
    int x = 10;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface CampoGenerativo {
    public String codigo() default "no";
    public int valor() default 0;
}

class Generativa {
    @CampoGenerativo(codigo = "protected int x", valor = 10)
    int x = 10;
}

public class Experimento3 {
    private static String createClassDef(String nameClass, String field) {
        String openClass = "public class " + nameClass + " {";
        String closeClass = "}";
        return openClass + field + closeClass;
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
        Class<?> c = Class.forName("c_generativa.Generativa");
        Field f = c.getDeclaredField("x");
        CampoGenerativo cg = f.getAnnotation(CampoGenerativo.class);

        StringBuilder sb = new StringBuilder();
        if(cg != null) {
            sb.append(cg.codigo());
            sb.append("=");
            sb.append(cg.valor());
            sb.append(";");
        }
        createAndCompileClassFile(createClassDef("Generado", sb.toString()), "Generado");

        Class<?> k = Class.forName("Generado");
        Field g = k.getDeclaredField("x");
        System.out.println(g);
        System.out.println(k.newInstance());
    }
}