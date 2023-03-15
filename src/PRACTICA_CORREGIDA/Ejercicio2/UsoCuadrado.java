package PRACTICA_CORREGIDA.Ejercicio2;

import java.util.Scanner;

public class UsoCuadrado {
    public static void main(String[] args) throws ExcepcionCuadrado {
       try { Scanner sc = new Scanner(System.in);
/*
        // Cuadrado cuadrado1=new Cuadrado(0);
        // Cuadrado cuadrado2=new Cuadrado(-4);
        Cuadrado cuadrado3=new Cuadrado(10);
        cuadrado3.dibujar();
        System.out.println("El area del cuadrado es "+cuadrado3.area());
        System.out.println("El volumen del cuadrado es "+cuadrado3.volumen());
        System.out.println("El lado del cuadrado es "+cuadrado3.getLado());
        System.out.println("Introduza un nuevo para el lado");
        cuadrado3.setLado(sc.nextInt());
        //////////////////////////////////////////////////////////////////////
        System.out.println("El nuevo valor del lado es "+cuadrado3.getLado());
        System.out.println("Recalculando areas y volumenes");
        System.out.println("El area del cuadrado es "+cuadrado3.area());
        System.out.println("El volumen del cuadrado es "+cuadrado3.volumen());
        //////////////////////////////////////////////////////////////////////
        System.out.println("Creando un nevo cuadrado");
        System.out.println("Introduzca el valor de su lado");
        int lado = sc.nextInt();
        Cuadrado cuadrado4 = new Cuadrado(lado);
        System.out.println("El area del cuadrado es "+cuadrado4.area());
        System.out.println("El volumen del cuadrado es "+cuadrado4.volumen());
        System.out.println("El lado del cuadrado es "+cuadrado4.getLado());*/

        Cuadrado cuadrado5=new Cuadrado(5);
        Cuadrado cuadrado6=new Cuadrado(6);
        Cuadrado cuadrado7=new Cuadrado(7);
        Cuadrado [] lista_cuadrados = {cuadrado5,cuadrado6,cuadrado7};
        for (int i=0; i<lista_cuadrados.length;i++){
            System.out.println("El cuadrado "+i+" tiene un area de "+lista_cuadrados[i].area()+ " y un volumen de "+lista_cuadrados[i].volumen());
        }
       }catch (Exception e){
           System.out.println(e.getMessage());

        }
        //TAMBIEN SE PUEDE PONER ASI: Cuadrado [] lista_cuadrados = new Cuadrado [3];
    }
}
