package Session1310;

import java.util.Scanner;

public class ForIncrementalDecremental {
    public static void main(String[] args) {

        int numero=0;


        //bucle incremental

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        System.out.println("Vamos a mostrar por pantalla los numeros de 1 a " + numero);

        for (int i=1;i<=numero;i++)
        {
            System.out.println(i);
        }

        //bucle decremental
        System.out.println("Vamos a mostrar por pantalla los numeros de " + numero + " a 1");
        for (int j=numero;j>0;j--)
        {
            System.out.println(j);
        }
    }
}
