package Session0303;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calcu1=new Calculadora(5,6);
        System.out.println("Dime el primer valor");
        int num1=sc.nextInt();
        System.out.println("Dime el segundo valor");
        int num2=sc.nextInt();
        Calculadora calcu2=new Calculadora(num1,num2);
        System.out.println("La suma de la calcu1 es "+calcu1.sumar(calcu1.getNum1(),calcu1.getNum2()));
        System.out.println("La multiplicacion de la calcu1 es "+calcu2.multiplicar(num1,num2));

    }
}
