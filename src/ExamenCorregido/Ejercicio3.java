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

        imprimir_multiplos(array);

        numeros_negativos(array);

        int[] array7={4,6,6,4};
        verificar_capicua(array7);
    }

    private static void verificar_capicua(int[] array){

        int[] array_invertido = new int[array.length];
        int j=array.length;
        for (int i=0;i<array_invertido.length;i++){

            array_invertido[i]=array[i];
            j--;
        }

        if (Arrays.equals(array,array)){
            System.out.println("Es capicua");
        }

        else {
            System.out.println("No es capicua");
        }

    }



    private static void numeros_negativos(int [] array){

        int contador=0;
        for (int i=0; i<array.length;i++){
            if (array[i]<0){
                contador ++;
            }
        }

        if (contador==0){
            System.out.println("No hay negativos en el array");
        }

        else{
            System.out.println("El numero de negativos es " + contador);
        }
    }

    public static void imprimir_multiplos(int [] array){

        for (int i=0;i<array.length;i++){

            if ((array[i] % 3 == 0)&&(array[i] % 5==0)){
                System.out.println("\u001B[31m"+array[i]+"\u001B[0m");

            }

        }

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
