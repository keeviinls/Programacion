package Session1710;

import java.util.Locale;
import java.util.Scanner;

public class E2EC {
    public static void main(String[] args) {

    String dia="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana y te mostraremos que asignatura toca a primera hora");
        dia= sc.next();
        dia = dia.toLowerCase();

        switch (dia){
            case "lunes": {System.out.println("Base de datos");break;}
            case "martes": {System.out.println("Lenguaje");break;}
            case "miercoles": {System.out.println("Programacion");break;}
            case "jueves": {System.out.println("Base de datos");break;}
            case "viernes": {System.out.println("Fol");break;}
            default: System.out.println("No has introducido un dia de la semana");break;
        }
    }
}
