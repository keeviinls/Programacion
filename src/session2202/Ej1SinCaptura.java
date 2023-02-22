package session2202;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1SinCaptura {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("Introduzca el dividendo");
            int dividendo = sc.nextInt();
            System.out.println("Introduzca el divisor");
            int divisor = sc.nextInt();
            System.out.println("El cocientes es " +dividendo / divisor);
        }



        //en lugar de poner "e" se le puede poner cualquier cosa, solo hemos puesto eso pq la profe lo llamo asi
        //ESTE ERROR ES APRA CUANDO PONEMOS POR EJEMPLO "MARIA" EN el dividendo
        catch (InputMismatchException e ){
            System.out.println("Has introducido un valor que no se corresponde con el tipo de datos");
        }

        //ESTE ES PARA CUANDO PONEMOS 0
        catch (ArithmeticException e){
            System.out.println("No puedes dividir entre 0");
        }

        finally {
            sc.close();
        }

    }

}
