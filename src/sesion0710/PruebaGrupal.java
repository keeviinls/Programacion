package sesion0710;

import java.awt.*;
import java.util.Scanner;

public class PruebaGrupal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcion;
        System.out.println("Quieres jugar al ♟ ajedrez ♟ ?");
        opcion= sc.next().charAt(0);

        if (opcion == 's' || opcion == 'S' ) {

            String caballo = "\u2658";

            System.out.println("  \uD83D\uDE0E TABLA  AJEDREZ \uD83D\uDE0E");

            System.out.println("\033[33m╔══════════════════════╗");
            System.out.print("\033[33m║");

            System.out.print("\033[31m \u2656");
            System.out.print(" ");
            System.out.print(caballo);
            System.out.print(" ");
            System.out.print("♗");
            System.out.print(" ");
            System.out.print("♚");
            System.out.print(" ");
            System.out.print("♛");
            System.out.print(" ");

            System.out.print("♗");
            System.out.print(" ");
            System.out.print("\u2658");
            System.out.print(" ");
            System.out.print("\u2656");
            System.out.print("\033[33m ║");
            System.out.print("");

            System.out.println("");
            System.out.print("\033[33m║");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");
            System.out.print("\033[31m ♙");


            System.out.print("\033[33m ║");
            System.out.println("");

            System.out.print("\033[33m║" + "                      " + "║");
            System.out.println("");
            System.out.print("\033[33m║" + "                      " + "║");
            System.out.println("");
            System.out.print("\033[33m║");

            System.out.print("\033[34m \u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.print(" ");
            System.out.print("\u2659");
            System.out.println("\033[33m ║");


            System.out.print("\033[33m║");

            System.out.print("\033[34m \u2656");
            System.out.print("\033[34m \u2658");
            System.out.print("\033[34m \u2657");
            System.out.print("\033[34m \u265A");
            System.out.print("\033[34m \u265B");
            System.out.print("\033[34m \u2657");
            System.out.print("\033[34m \u2658");
            System.out.print("\033[34m \u2656");
            System.out.println("\033[33m ║");

            System.out.println("╚══════════════════════╝");
        }


        else {
            System.out.println("\033[31m \uD83D\uDC80 Bueno pues tu te lo pierdes \uD83D\uDC80\n");
        }
    }

}
