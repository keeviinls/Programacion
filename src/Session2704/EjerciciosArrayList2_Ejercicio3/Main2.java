package Session2704.EjerciciosArrayList2_Ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static ArrayList<Persona> listado_personas = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do{

            System.out.println("0. Salir del programa");
            System.out.println("1. Añadir persona al arraylist");
            System.out.println("2. Buscar persona por dni en el arraylist");
            System.out.println("3. Eliminar persona por dni");
            System.out.println("4. Ordenar por apellidos");
            System.out.println("5. Ordenar por apellidos y sexo");
            System.out.println("6. Imprimir el arraylist");
            System.out.println("....................");
            opcion=sc.nextInt();

            switch (opcion){
                case 0 : System.out.println("Gracias por usar el programa");break;
                case 1: add();break;
                case 2:
                    System.out.println("Introduzcir el dni del usuario");
                    String dni = sc.next();
                    buscar(dni);break;
                case 3:
                    System.out.println("Introducir el dni del usuario");
                    dni = sc.next();
                    eliminar(dni);break;
                case 4: ordenar_apellido();break;
                case 5: ordenar_apellido_sexo();break;

                case 6: imprimir();


                default: System.out.println("Te has equivocado de opcion");break;
            }

        } while (opcion!=0);
    }

    private static void ordenar_apellido_sexo() {
        System.out.println("Ordenacion por apellido y sexo");
        listado_personas.sort(Comparator.comparing(Persona::getApellidos).thenComparing(Persona::getSexo));
        /**
         * LO DE IMPIMIR LO PONEMOS PARA BASICAMENTE AHORRARNOS TENER QUE USAR LA OPCION 6 TODO EL RATO.
         */
        imprimir();
    }

    private static void ordenar_apellido() {
        System.out.println("Ordenacion por apellido");
        listado_personas.sort(Comparator.comparing(Persona::getApellidos));
        imprimir();
    }

    private static void eliminar(String dni) {
        for (Persona p:listado_personas){
            if (p.getDni().equals(dni)){
                listado_personas.remove(p);
            }
        }

        System.out.println("Eliminado correctamente");
    }

    private static void imprimir() {
        for (Persona p : listado_personas) {
            System.out.println(p.toString().toString());
        }

    }

    private static void buscar(String dni) {
    boolean esta = false;
        for (Persona p:listado_personas){
            if (p.getDni().equals(dni)){
                esta = true;
                break;
            }
        }

        if (esta){
            System.out.println("El DNI "+dni+" esta en el array list");
        }
        else {
            System.out.println("Lo sentimos pero el DNI " +dni+ " no esta en el array list");
        }

    }

    private static void add() {
        System.out.println("Introduzca el dni de la persona ");
        String dni = sc.next();
        System.out.println("Introduzca el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido de la persona ");
        String apellido = sc.next();
        System.out.println("Introduzca el sexo con H o M ");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Introduzca la edad de la persona");
        int edad = sc.nextInt();
        System.out.println("Introduzca el peso de la persona");
        double peso = sc.nextDouble();

        Persona p1 = new Persona(dni,apellido,nombre,sexo,edad,peso);
        listado_personas.add(p1);
        System.out.println("Insertado correctamente");

    }

}
