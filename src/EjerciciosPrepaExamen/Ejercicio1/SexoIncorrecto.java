package EjerciciosPrepaExamen.Ejercicio1;

public class SexoIncorrecto extends Exception{
    public SexoIncorrecto (String mensaje){
        super(mensaje);
        //ESTA OPCION TAMBIEN VALE: System.out.println(mensaje);
    }
}
