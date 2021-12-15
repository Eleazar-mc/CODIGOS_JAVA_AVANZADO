//package c_bases;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Method;
//
//public class C14_Anotaciones {
//    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
//        Method metodo = Componente.class.getMethod("getCampo", int.class);
//        AnotacionMetodo anotacion = metodo.getAnnotation(AnotacionMetodo.class);
//
//        AnotacionMetodo am = anotacion;
//        System.out.println("Valor de la anotación del método: " + am.value());
//
//        // Arreglo bidimensional para contener un arreglo de anotaciones por cada parámetro
//        Annotation[][] anotacionesParam = metodo.getParameterAnnotations();
//        Class<?>[] tiposParam = metodo.getParameterTypes();
//
//        int i = 0;
//        for (Annotation[] anotaciones : anotacionesParam) {
//            Class<?> tipoParam = tiposParam[i++];
//
//            for (Annotation annotation : anotaciones) {
//                if (annotation instanceof AnotacionParametro) {
//                    AnotacionParametro myAnnotation = (AnotacionParametro) annotation;
//                    System.out.println("Tipo del argumento o parámetro: " + tipoParam.getName());
//                    System.out.println("Valor de la anotación del argumento: " + myAnnotation.value());
//                }
//            }
//        }
//    }
//}
//
//// Hacer los programas para extraer anotaciones en campos,
//// constructores, parámetros de constructores y en clases
//// internas. En clases internas mostrar que es posible hacer
//// lo mismo para extraer anotaciones de cualquiera de sus
//// miembros.