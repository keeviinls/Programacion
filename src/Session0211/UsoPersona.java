package Session0211;

import java.time.LocalDate;
import java.util.Scanner;

public class UsoPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("introduzca el nombre de la persona");
        persona.nombre=sc.next();
        System.out.println("indroduzca la edad de la persona");
        persona.edad=sc.nextInt();
        System.out.println(persona.nombre+ " nacio en el año "+persona.obtener_Anyo(persona.edad));


    }
}
