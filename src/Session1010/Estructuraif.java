package Session1010;

import java.util.Scanner;

public class Estructuraif {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int mayor = 0;
        int menor = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el valor de a: " );
        a= sc.nextInt();
        System.out.println("Introduzca el valor de b: ");
        b=sc.nextInt();
        mayor=a;
        menor = b;
        if (a<b){
            mayor=b;
            menor=a;
        }
        if (a==b){
            System.out.println("los numeros son iguales");
        }
        System.out.println("El mayor es "+mayor+" y el numero menor es "+ menor);
    }
}
