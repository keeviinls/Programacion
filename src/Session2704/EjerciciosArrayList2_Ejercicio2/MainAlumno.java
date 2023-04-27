package Session2704.EjerciciosArrayList2_Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class MainAlumno {
    public static void main(String[] args) {
        //arraylist
        ArrayList<Alumno> listado_alumnos = new ArrayList<>();
        //crear alumnos

        Alumno a1 = new Alumno("Sofia", 10);

        listado_alumnos.add(a1);

        /**
         * esta es otra opcion de agregar al alumno
         */
        listado_alumnos.add(new Alumno("moha", 7));
        listado_alumnos.add(new Alumno("carasa", 8));
        listado_alumnos.add(new Alumno("gallego", 2));
        listado_alumnos.add(new Alumno("sofia", 3));

        /**
         * POR NOMBRE
         */

        System.out.println("Ordenacion por orden alfabeticos ascendente");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println(listado_alumnos.toString());
        System.out.println("Ordenacion por orden alfabeticos descendente");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(listado_alumnos.toString());

        /**
         * POR NOTA
         */

        System.out.println("Ordenacion por nota ascendente");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNota));
        System.out.println(listado_alumnos.toString());

        System.out.println("Ordenacion por nota descendente");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(listado_alumnos.toString());

        /**
         * AMBAS
         */

        System.out.println("Ordenación por ambas ascendente ");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getNota));
        System.out.println(listado_alumnos.toString());

        System.out.println("Ordenación por ambas descendente ");
        listado_alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed().thenComparing(Alumno::getNota));
        System.out.println(listado_alumnos.toString());

    }
}
