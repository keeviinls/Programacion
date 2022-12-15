package PRACTICA2;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICA2 {
    public static void main(String[] args) {
        float [] temperaturas = new float[12];

        temperaturas=array(temperaturas);
        System.out.println(Arrays.toString(temperaturas));
        float mayor = mes_mayor(temperaturas);
        float menor = mes_menor(temperaturas);

        imprimir_temperatura(temperaturas);
        verano(temperaturas);
        invierno(temperaturas);


    }


    public static float invierno (float [] temperaturas){

        float mediai= 0;

        mediai = (temperaturas[11] + temperaturas[0] + temperaturas [1])/3;

        System.out.println("La temperatura media de invierno es "+mediai);

        return mediai;


    }

    public static float verano (float [] temperaturas){

        float mediav= 0;

        mediav = (temperaturas[5] + temperaturas[6] + temperaturas [7])/3;

        System.out.println("La temperatura media de verano es "+mediav);

        return mediav;


    }

    private static void imprimir_temperatura (float [] temperaturas){
        int mes= 0 ;
        System.out.println("Introduce el mes del que quieras saber la temperatura:");
        Scanner sc=new Scanner(System.in);
        mes=sc.nextInt();
        switch (mes){
            case 1:
                System.out.println(String.valueOf(meses.Enero) + "---"+temperaturas[0]+ "grados");
                break;
            case 2:
                System.out.println(String.valueOf(meses.Febrero) + "---"+temperaturas[1]+ "grados");
                break;
            case 3:
                System.out.println(String.valueOf(meses.Marzo) + "---"+temperaturas[2]+ "grados");
                break;
            case 4:
                System.out.println(String.valueOf(meses.Abril) + "---"+temperaturas[3]+ "grados");
                break;
            case 5:
                System.out.println(String.valueOf(meses.Mayo) + "---"+temperaturas[4]+ "grados");
                break;
            case 6:
                System.out.println(String.valueOf(meses.Junio) + "---"+temperaturas[5]+ "grados");
                break;
            case 7:
                System.out.println(String.valueOf(meses.Julio) + "---"+temperaturas[6]+ "grados");
                break;
            case 8:
                System.out.println(String.valueOf(meses.Agosto) + "---"+temperaturas[7]+ "grados");
                break;
            case 9:
                System.out.println(String.valueOf(meses.Septiembre) + "---"+temperaturas[8]+ "grados");
                break;
            case 10:
                System.out.println(String.valueOf(meses.Octubre) + "---"+temperaturas[9]+ "grados");
                break;
            case 11:
                System.out.println(String.valueOf(meses.Noviembre) + "---"+temperaturas[10]+ "grados");
                break;
            case 12:
                System.out.println(String.valueOf(meses.Diciembre) + "---"+temperaturas[10]+ "grados");
                break;


        }

    }










    private static float mes_menor (float [] temperaturas){

        float menor = temperaturas[0];

        for (int i = 1; i<temperaturas.length; i++){
            if (temperaturas [i] < menor){
                menor = temperaturas [i];
            }
        }


        if (temperaturas[0]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Enero)+" con "+menor);
        }
        else if (temperaturas[1]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Febrero)+" con "+menor);
        }
        else if (temperaturas[2]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Marzo)+" con "+menor);
        }
        else if (temperaturas[3]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Abril)+" con "+menor);
        }
        else if (temperaturas[4]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Mayo)+" con "+menor);
        }
        else if (temperaturas[5]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Junio)+" con "+menor);
        }
        else if (temperaturas[6]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Julio)+" con "+menor);
        }
        else if (temperaturas[7]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Agosto)+" con "+menor);
        }
        else if (temperaturas[8]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Septiembre)+" con "+menor);
        }
        else if (temperaturas[9]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Octubre)+" con "+menor);
        }
        else if (temperaturas[10]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Noviembre)+" con "+menor);
        }
        else if (temperaturas[11]==menor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Diciembre)+" con "+menor);
        }
        return menor;


    }




    private static float mes_mayor (float [] temperaturas){

        float mayor = 0;

        for (int i = 1; i<temperaturas.length; i++){
            if (temperaturas [i] > mayor){
                mayor = temperaturas [i];
            }
        }

        if (temperaturas[0]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Enero)+" con "+mayor);
        }
        else if (temperaturas[1]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Febrero)+" con "+mayor);
        }
        else if (temperaturas[2]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Marzo)+" con "+mayor);
        }
        else if (temperaturas[3]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Abril)+" con "+mayor);
        }
        else if (temperaturas[4]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Mayo)+" con "+mayor);
        }
        else if (temperaturas[5]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Junio)+" con "+mayor);
        }
        else if (temperaturas[6]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Julio)+" con "+mayor);
        }
        else if (temperaturas[7]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Agosto)+" con "+mayor);
        }
        else if (temperaturas[8]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Septiembre)+" con "+mayor);
        }
        else if (temperaturas[9]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Octubre)+" con "+mayor);
        }
        else if (temperaturas[10]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Noviembre)+" con "+mayor);
        }
        else if (temperaturas[11]==mayor){
            System.out.println("El mes con mayor temperatura es "+String.valueOf(meses.Diciembre)+" con "+mayor);
        }
        return mayor;



    }


    private static float [] array (float [] temperaturas){


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<temperaturas.length; i++){
            System.out.println("Dime la temperatura de"+ meses(i));
            temperaturas[i]= sc.nextFloat();

        }

        return temperaturas;
    }
    public static String meses (int numero){
        meses mes = meses.Diciembre;
        String m = "";
        switch (numero){
            case 0:
                m = String.valueOf(meses.Enero);
                break;
            case 1:
                m = String.valueOf(meses.Febrero);
                break;
            case 2:
                m = String.valueOf(meses.Marzo);
                break;
            case 3:
                m = String.valueOf(meses.Abril);
                break;
            case 4:
                m = String.valueOf(meses.Mayo);
                break;
            case 5:
                m = String.valueOf(meses.Junio);
                break;
            case 6:
                m = String.valueOf(meses.Julio);
                break;
            case 7:
                m = String.valueOf(meses.Agosto);
                break;
            case 8:
                m = String.valueOf(meses.Septiembre);
                break;
            case 9:
                m = String.valueOf(meses.Octubre);
                break;
            case 10:
                m = String.valueOf(meses.Noviembre);
                break;
            case 11:
                m = String.valueOf(meses.Diciembre);
                break;
        }
        return m;
    }
}
