package session0202;

import Session0102.Vehiculo;

import java.util.Scanner;

public class UsoPlaneta {
    public static void main(String[] args) {
        Planeta planeta1 =new Planeta();
        Planeta planeta2=new Planeta("JUPITER", 4, Math.pow(1.898,27), Math.pow(1.4313,15), 139, 7780000, Tipo_Planeta.TERRESTRE, true);
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el nombre del planeta ");
        String nombre=sc.next();

        System.out.println("Dime la cantidad de satelites ");
        int satelites=sc.nextInt();

        System.out.println("Dime la cantidad de masa ");

        double masa=sc.nextDouble();

        System.out.println("Dime la cantiad de volumen ");
        double volumen= sc.nextDouble();

        System.out.println("Dime el diametro ");
        int diametro=sc.nextInt();

        System.out.println("Dime la distancia que hay con el sol ");
        int distancia_sol=sc.nextInt();

        System.out.println("Dime que tipo de planeta : ENANO - GASEOSO - TERRESTRE");
        String tipo=sc.next().toUpperCase();
        Tipo_Planeta tipo_planeta=Tipo_Planeta.valueOf(tipo);

        System.out.println("Dime si es observable o no:  S-N");
        char opcion=sc.next().toUpperCase().charAt(0);
        boolean observable=false;

        if (opcion=='S'){
            observable=true;
        }

        Planeta planeta3= new Planeta(nombre,satelites,masa,volumen,diametro,distancia_sol,tipo_planeta,observable);

        //SE PUEDE HACER DE LAS 2 FORMAS
        planeta1.imprimir();
        System.out.println("========================================================");

        System.out.println(planeta3.toString());
        System.out.println("========================================================");
        System.out.println("La densidad del planeta dos es "+planeta2.calcularDensidad());
        System.out.println("========================================================");
        System.out.println("Verificar que el planeta tres es observable "+planeta3.esPlanetaExterior());
    }
}
