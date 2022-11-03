package Session0211;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FactorialRecursivo {
    public static long factorialRecursivo(long numero){

        if (numero<=1){
            return 1;
        }

        return numero*factorialRecursivo(numero-1);

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero para calcular su factorial");
        long numero = 0;
        numero = sc.nextLong();
        System.out.println("El factorial de 3 es "+factorialRecursivo(numero));
    }
}

//factorialRecursivo(4)
//4*factorialRecursivo(3);
//4*3*factorialRecursivo(2);
//4*3*2*factorialRecursivo(1);
//4*3*2*1=24

