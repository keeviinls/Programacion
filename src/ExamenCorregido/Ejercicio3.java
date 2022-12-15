package ExamenCorregido;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //  declaracion el array de int
        int dimension = solicitardimesion();
        System.out.println("la dimension es "+dimension);
        int array [] = new int[dimension];
        array=inicializar(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] inicializar(int [] array){

        final int MIN=-200;
        final int MAX=200;

        for (int i=0;i<array.length;i++){

            array[i] = (int) (Math.random()*((MAX-MIN+1))+MIN);
        }

        return array;
    }
    private static int solicitardimesion() {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;

        do {
            System.out.println("Introduzcame una correcta");
            resultado = sc.nextInt();
        }while (resultado<=0 );

        return resultado;
    }
}
