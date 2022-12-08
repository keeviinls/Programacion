package Session0211;

import Session0211.Persona;

public class PasoValorObjetos {
    public static void main(String... hazloMejor) {
        Persona p1 = new Persona();
        p1.nombre="Mark";
        System.out.println(p1.nombre);   //HASTA AQUI DECLARAS Q EL NOMBRE P1 ES MARK
        transformarNombre(p1);  //AQUI LLAMAS AL METODO
        System.out.println("despues de pasarle el metodo transformarNombre....");
        System.out.println("el nombre es "+p1.nombre);   //AQUI EL METODO ES APLICADO

    }

    static void transformarNombre (Persona p) {
        p.nombre = "Kevin";

    }
}
