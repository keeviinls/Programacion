package Examen2Trimestre_CORREGIDO.Ejercicio2;

public abstract class Emisora implements Emitible{

    //atributos

    protected static int num_emisoras=0;
    protected int identificador;
    protected String nombre_emisora;
    protected int anyo_creacion;
    protected boolean emitiendo=false;
    protected int num_oyentes;
}
