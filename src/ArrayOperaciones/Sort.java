package ArrayOperaciones;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] numeros ={121,12,1,55};

        //CON SORT PODEMOS ORDENAR EL CONTENIDO DE MANERA ASCENDENTE
        // EN NUMEROS LO ORDENEDA DE MENOR A MAYOR Y EN LETRAS LO ORDENA ALFABETICAMENTE
        Arrays.sort(numeros);
        System.out.println("SI LO ORDENAMOS SERIA ASI "+Arrays.toString(numeros));

        String [] nombres ={"Zoro", "Messi", "Alberto", "Daniel"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
    }
}
