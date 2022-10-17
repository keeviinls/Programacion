package Session1710;

import java.util.Scanner;

public class E1EC {
    public static void main(String[] args) {

        String mes="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entre un numero y este indicara el mes");
        mes= sc.next();

        switch (mes){
            case "1": {System.out.println("Es Enero");break;}
            case "2": {System.out.println("Es Febrero");break;}
            case "3": {System.out.println("Es Marzo");break;}
            case "4": {System.out.println("Es Abril");break;}
            case "5": {System.out.println("Es Mayo");break;}
            case "6": {System.out.println("Es Junio");break;}
            case "7": {System.out.println("Es Julio");break;}
            case "8": {System.out.println("Es Agosto");break;}
            case "9": {System.out.println("Es Septiembre");break;}
            case "10": {System.out.println("Es Octubre");break;}
            case "11": {System.out.println("Es Noviembre");break;}
            case "12": {System.out.println("Es Diciembre");break;}
            default: System.out.println("Ha introducido un numero que no corresponde a un mes");break;
        }
    }
}
