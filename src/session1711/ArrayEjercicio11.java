package session1711;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEjercicio11 {
    public static void main(String[] args) {
        int [] array1 = {1,2};
        int [] array1simulado = new int[3];
        System.out.println("el array es" +Arrays.toString(array1));
        System.arraycopy(array1, 0, array1simulado, 0, array1.length);
        System.out.println("el arraysimulado  es"+Arrays.toString(array1simulado));
        System.out.println("¿quieres intentar nuevoelemento ");
        Scanner sc = new Scanner(System.in);
        char opcion = sc.next().toLowerCase().charAt(0);

        if (opcion=='s'){
            System.out.println("dime numero");
            int valornuevo = sc.nextInt();
            array1simulado[array1simulado.length-1]=valornuevo;
            System.out.println("el array es "+Arrays.toString(array1simulado));
        }

        else {
            System.out.println("pues nada");
        }
    }
}
