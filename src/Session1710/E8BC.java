package Session1710;

import java.util.Scanner;

public class E8BC {
    public static void main(String[] args) {
        int numero=0;
        int tabla=0;
        System.out.println("Tabla de Multiplicar, introduce un numero y te mostraremos su tabla hasta el 10");
        Scanner sc=new Scanner(System.in);
        numero=sc.nextInt();

        for (int i=0; i<=10;i++)
        {
            System.out.println("el numero " +numero+ " multiplicado por " +i+ " es " +numero*i);
        }
    }
}
