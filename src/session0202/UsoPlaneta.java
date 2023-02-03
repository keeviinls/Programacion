package session0202;

import java.util.Scanner;

public class UsoPlaneta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el nombre del planeta");
        nombre=sc.next();
        System.out.println("Dime la cantidad de satelites");
        satelites=sc.nextInt();
        System.out.println("Dime la cantidad de masa en kilogramos");
        masa=sc.nextDouble();
        System.out.println("Dime la cantidad de volumen en kilometros cubicos");
        volumen=sc.nextDouble();
        System.out.println("Dime el diamtro en kilometros");
        diametro=sc.nextInt();
        System.out.println("Dime la distancia media que hay hacia el sol en millones de kilometros");
        distancia_sol=sc.nextInt();
        System.out.println("Dime que tipo de planeta es ");
        tipo_planeta=tipo_planeta.valueOf(sc.next().toUpperCase());
        System.out.println("El planeta es observable a simple vista");
        observable=sc.nextBoolean();
    }
}
