package Session1010;

import java.util.Scanner;

public class EstructuraIfAnidados {
    public static void main(String[] args) {
        int edad=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad actual");
        edad= sc.nextInt();

        if (edad>=0 && edad<=5)
        {
            System.out.println("Educacion Infantil");
        }
        else if (edad>=6 && edad <=12)
        {
            System.out.println("Educacion Primaria");
        }
        else if (edad>=13 && edad<=17)
        {
            System.out.println("Educacion Secundaria");
        }
        else {
            System.out.println("Universidad y FP");
        }
    }
}
