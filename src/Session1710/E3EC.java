package Session1710;

import java.util.Scanner;

public class E3EC {
    public static void main(String[] args) {

        int hora=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una hora");
        hora=  sc.nextInt();

        if (hora>6 && hora<=12)
        {
            System.out.println("Buenos Dias");
        }
        else if (hora>13 && hora<=20)
        {
            System.out.println("Buenos Tardes");
        }
        else if (hora>21&&hora<=5)
        {
            System.out.println("Buenas Noches");
        }
        else {
            System.out.println("no has introducido hora correcta");
        }



    }
}
