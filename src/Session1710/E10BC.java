package Session1710;

import java.util.Scanner;

public class E10BC {
    public static void main(String[] args) {


        double a, media, i = 0;
        double b = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca un numero (para dejar de introducir valores introduzca un valor negativo)");
            a = sc.nextDouble();
            if (a>=0) {
                b = b + a;
                i++;
            }

        }while (a >=0);
        media = b/i;
        System.out.println("La media de los números introducidos es: "+media);
    }
}

