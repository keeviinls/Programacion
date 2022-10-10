package Session1010;

import java.util.Scanner;

public class EstructuraIfElse {
    public static void main(String[] args) {
                int a,b,mayor,menor=0;
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
                else {
                    if (a>b){
                        mayor=b;
                        menor =a;
                    }
                    System.out.println("El mayor es "+mayor+" y el numero menor es "+ menor);
                }


    }
}
