package Session2604;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * WORD DE EJERCICIOS DE ARRAYLIST 2
 */

public class Main {

    /**
     * PONEMOS EL ARRAY AQUI FUERA DEL MAIN PARA QUE EL METODO DE ABAJO
     * EL PUBLIC STATIC VOID ADD, LO PUEDA RECONOCER, SI LO PONEMOS DENTRO DEL MAIN
     * NO LO VERIA.
     */
    public static ArrayList<Double> lista_reales = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;
        int posicion=0;
        double numero = 0;
        Scanner sc = new Scanner(System.in);
        double numero_antiguo =0, numero_nuevo=0;
        do {
            System.out.println("0. Salir del programa");
            System.out.println("1. Agregar un numero al arraylist");
            System.out.println("2. Buscar un numero en el arraylist");
            System.out.println("3. Modificar un numero");
            System.out.println("4. Eliminar un numero");
            System.out.println("5. Insertar un numero en una posicion dada");
            System.out.println("6. Imprimir array");
            System.out.println("................");
            opcion = sc.nextInt();
                switch (opcion){
                    case 0 : System.out.println("Gracias por usar el programa");break;
                    case 1:
                        System.out.println("Introduzca por favor el numero que quiere añadir al arraylist");
                        numero = sc.nextDouble();
                        add(numero);break;
                    case 2:
                        System.out.println("Introduzca por favor el numero que quiere buscar en el arraylist");
                        numero=sc.nextDouble();
                        buscar(numero);break;
                    case 3:
                        System.out.println("Introduzca por favor el numero que quiere modificar en el arraylist");
                        numero_antiguo = sc.nextDouble();
                        System.out.println("Introduzca el nuevo valor");
                        numero_nuevo=sc.nextDouble();
                        modificar(numero_antiguo,numero_nuevo);break;
                    case 4:
                        System.out.println("Introduzca por favor el numero que quiere eliminar del arraylist");
                        numero=sc.nextDouble();
                        eliminar(numero);break;
                    case 5:
                        System.out.println("Introduzca el numero a insertar");
                        numero=sc.nextDouble();
                        System.out.println("Dime la posicion en la que quiere insertar");
                        posicion = sc.nextInt();
                        add_specific(numero, posicion);break;
                    case 6:
                        imprimir_array();break;

                }
        } while (opcion != 0);
    }

    private static void imprimir_array() {
        System.out.println(lista_reales.toString());
    }

    private static void add_specific(double numero, int posicion) {

        lista_reales.set(posicion,numero);

    }

    private static void eliminar(double numero) {
        lista_reales.remove(numero);
        /**
         * ESTA FORMA TAMBIEN FUNCIONARIA
         * lista_reales.remove(lista_reales.indexOf(numero));
         */

    }

    private static void modificar(double numero_antiguo, double numero_nuevo) {
        /**
         * TAMBIEN SE PUEDE USAR EL indexOf en lugar de contains en el primer IF
         */

        if (lista_reales.contains(numero_antiguo)){
            int posicion = lista_reales.indexOf(numero_antiguo);
            lista_reales.set(posicion,numero_nuevo);
        }
    }

    private static void buscar(double numero) {

        int posicion = lista_reales.indexOf(numero);

        if (posicion!=-1){
            System.out.println("Está");
        }
        else {
            System.out.println("No está");
        }

    }

    private static void add(double numero) {
        lista_reales.add(numero);
    }


}
