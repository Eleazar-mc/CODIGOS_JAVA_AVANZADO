//package c_bases;
//
//import java.lang.annotation.Annotation;
//
//public class C13_Anotaciones {
//    public static void main(String[] args) {
//        Class<?> klass = Componente.class;
//        Annotation[] anotaciones = klass.getAnnotations();
//
//        for(Annotation anotacion : anotaciones){
//            if(anotacion instanceof AnotacionClase){
//                AnotacionClase a = (AnotacionClase) anotacion;
//                System.out.println("name: " + a.nombre());
//                System.out.println("value: " + a.valor());
//            }
//        }
//
//        Annotation annotacion = klass.getAnnotation(AnotacionClase.class);
//
//        if(annotacion instanceof AnotacionClase){
//            AnotacionClase myAnnotation = (AnotacionClase) annotacion;
//            System.out.println("name: " + myAnnotation.nombre());
//            System.out.println("value: " + myAnnotation.valor());
//        }
//    }
//}