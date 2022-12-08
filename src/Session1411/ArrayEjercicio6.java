package Session1411;

import java.util.Arrays;

public class ArrayEjercicio6 {
    public static void main(String[] args) {

        int [] numeros = new int[6];


        java.util.Arrays.fill(numeros, 5);
        System.out.println(java.util.Arrays.toString(numeros));



        java.util.Arrays.fill(numeros, 2, 4, 8);   //fromindex : cuando empieza  tolindex : cuando acaba  val: que numero
        System.out.println(java.util.Arrays.toString(numeros));
    }

}
