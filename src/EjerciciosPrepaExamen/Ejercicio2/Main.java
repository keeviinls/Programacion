package EjerciciosPrepaExamen.Ejercicio2;

import EjerciciosPrepaExamen.Ejercicio1.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LongitudIncorrecta, ContrasenyaIncorrecta {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño que quiere que tenga el array de contraseñas");
        int tamanyo=sc.nextInt();


        Password [] listado_contrasenyas = new Password[tamanyo];
        for (int i=0;i<listado_contrasenyas.length;i++){
            System.out.println("Introduzca la longitud que tendran la contraseña "+listado_contrasenyas[i]);
            int longi=sc.nextInt();
            listado_contrasenyas [i] = new Password(longi);
        }

        boolean [] fortaleza_contrasenyas = new boolean[tamanyo];
        for (int i=0;i<listado_contrasenyas.length;i++){
            listado_contrasenyas[i] = listado_contrasenyas[i].esFuerte();
        }

        for (int i=0;i<listado_contrasenyas.length;i++){
            System.out.println("Contraseña "+listado_contrasenyas[i].getContrasenya()+ " Fortaleza " +fortaleza_contrasenyas[i]);
        }

    }
}
