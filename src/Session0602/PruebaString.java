package Session0602;

import java.util.Scanner;

public class PruebaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        System.out.println("El nombre introducido es "+nombre);

        System.out.println("Introduzca su apellido");
        String nombre2 = sc.next();
        System.out.println("El nombre introducido es "+nombre2);
    }
}
