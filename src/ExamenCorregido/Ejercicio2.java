package ExamenCorregido;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [][] comunidad=new String[3][2];
        comunidad=inicializar(comunidad);
        imprimir(comunidad);
        cuotas_comunidad();
        String nombre= "";
        System.out.println("Introduzcame el nombre que quieres buscar en el edificio");
        nombre = sc.next().toUpperCase();
        buscar_vecino(comunidad, nombre);



    }

    private static void buscar_vecino(String [][] comunidad, String nombre) {

        int contador=0;
        for (int i=0;i<comunidad.length;i++){
            for (int j=0;j<comunidad.length;j++){

                if (comunidad[i][j].equals(nombre)){
                    contador++;
                }

            }

        }
        if (contador==0){
            System.out.println("No hay ningun vecino llamado "+nombre);
        }
        else {
            System.out.println("Hay "+contador+" vecinos llamad@s "+nombre);
        }

    }

    private static void cuotas_comunidad() {

        final double COUOTA_PRIMERO=50.25;
        final double COUOTA_SEGUNDO=78.15;
        final double COUOTA_TERCERO=50.25;

        double total = 2*COUOTA_SEGUNDO+2*COUOTA_PRIMERO+2*COUOTA_TERCERO;
        System.out.println("La comunidad paga en cuotas "+total);

    }

    private static void imprimir(String [][] comunidad){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<comunidad.length;i++){
            for (int j=0;j<comunidad[i].length;j++){

                if (i==0){
                    switch (j){
                        case 0:
                            System.out.println("El nombre del  "+ Ordinales.primero + "A es "+comunidad[i][j]);break;

                        case 1:
                            System.out.println("El nombre del  "+ Ordinales.primero + "B es "+comunidad[i][j]);break;

                    }
                }

                if (i==1){
                    switch (j) {
                        case 0:
                            System.out.println("El nombre del  "+ Ordinales.segundo + "A es "+comunidad[i][j]);break;
                        case 1:
                            System.out.println("El nombre del  "+ Ordinales.segundo + "B es "+comunidad[i][j]);break;
                    }

                }
                if (i==2){
                    switch (j) {
                        case 0:
                            System.out.println("El nombre del  "+ Ordinales.tercero + "A es "+comunidad[i][j]);break;
                        case 1:
                            System.out.println("El nombre del  "+ Ordinales.tercero + "B es "+comunidad[i][j]);break;
                    }

                }
            }
        }
    }

    private static  String [][] inicializar(String [][] comunidad){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<comunidad.length;i++){
            for (int j=0;j<comunidad[i].length;j++){

                if (i==0){
                    switch (j){
                        case 0:
                            System.out.println("Introduzcame el nombre del propietario "+ Ordinales.primero + "A");
                            comunidad[i][j]=sc.next().toUpperCase();break;
                        case 1:
                            System.out.println("Introduzcame el nombre del propietario "+ Ordinales.primero + "B");
                            comunidad[i][j]=sc.next().toUpperCase();break;

                    }
                }

                if (i==1){
                switch (j) {
                    case 0:
                        System.out.println("Introduzcame el nombre del propietario "+ Ordinales.segundo + "A");
                        comunidad[i][j]=sc.next().toUpperCase();break;
                    case 1:
                        System.out.println("Introduzcame el nombre del propietario "+ Ordinales.segundo + "B");
                        comunidad[i][j]=sc.next().toUpperCase();break;
                }

                }
                if (i==2){
                    switch (j) {
                        case 0:
                            System.out.println("Introduzcame el nombre del propietario "+ Ordinales.tercero + "A");
                            comunidad[i][j]=sc.next().toUpperCase();break;
                        case 1:
                            System.out.println("Introduzcame el nombre del propietario "+ Ordinales.tercero + "B");
                            comunidad[i][j]=sc.next().toUpperCase();break;
                    }

                }
            }
        }

        return comunidad;
    }
}
