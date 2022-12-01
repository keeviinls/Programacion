package Session2811;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        numero= sc.nextInt();
        boolean resultado= esprimo(numero);
        if (resultado){
            System.out.println("Es primo");
        }

        else {
            System.out.println("No es primo");
        }


    }

    private static boolean esprimo(int numero) {
        boolean result;
        if (numero%numero==1 || numero%1==numero ){
            result = false;

        }
        else{
            result = true;
        }


        return result;
    }
}