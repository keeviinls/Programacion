package Repaso2102;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca la dimension del array");
        int dimension=sc.nextInt();
        int [] array_enteros = new int[dimension];

        for (int i=0;i<array_enteros.length;i++){
            System.out.println("Dime el valor para la posicion "+i);
            array_enteros[i]=sc.nextInt();
        }

        //RECORRERLO E IMPRIMIRLO

        for (int i=0;i<array_enteros.length;i++){
            System.out.println(array_enteros[i]);
        }

        System.out.println(Arrays.toString(array_enteros));

        //INDICAR CUANTOS NUMEROS SON POSITIVOS Y CUANTOS NEGATIVOS

        int contador_positivos=0, contador_negativos=0;
        for(int i=0;i<array_enteros.length;i++){

            if (array_enteros[i]>=0){
                contador_positivos++;
            }
            else {
                contador_negativos++;
            }
        }

        System.out.println("La cantidad de positivos es "+contador_positivos);
        System.out.println("La cantidad de negativos es "+contador_negativos);
    }



}
