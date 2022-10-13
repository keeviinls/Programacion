package Session1310;

import java.util.Scanner;

public class EstructuraWhile {
    public static void main(String[] args) {
        int numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el numero desde el cual quiere contar hasta 100");
        numero= sc.nextInt();
        if (numero>100){
            System.out.println("introdujo un numero superior");
        }
        while (numero<=100) {
            System.out.println(numero);
            numero++;
        }
    }
}
