package Session0211;

import java.util.Scanner;

public class FactorialIterativo {
    public static long factorial (long numero){

        if (numero<0) {
            numero = numero * -1;
        }

        long factorial = 1;
        while (numero > 1){
            factorial = factorial * numero;
            numero--;
        }

        return factorial;
    }

    public static void main(String[] args) {

        // 4*1=4    3*1 == 3   2*1 ==2   4*3=12    12*2 = 24
        Scanner sc = new Scanner(System.in);
        long numero = 0;
        System.out.println("Introduzca un numero para calcular su factorial");
        numero = sc.nextLong();
        System.out.println("El factorial de " +numero+ " es "+factorial(numero));
    }
}

