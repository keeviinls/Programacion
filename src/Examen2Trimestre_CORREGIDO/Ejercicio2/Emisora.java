package Examen2Trimestre_CORREGIDO.Ejercicio2;
/***
 * @author KevinLoayzaS
 * @version 1.0
 * Esta clase emisora permite almacenar informacion sobre emisoras
 */
public abstract class Emisora implements Emitible{

    //atributos

    protected static int num_emisoras=0;
    protected int identificador;
    protected String nombre_emisora;
    protected int anyo_creacion;

    protected boolean emitiendo=false;
    protected int num_oyentes;

    //constructor

    /***
     *
     * @param nombre_emisora
     * @param anyo_creacion
     * @param num_oyentes
     * @throws CreacionInvalida
     * este constructor permite crear una emisora a partir de los parametros de entrada indicados
     */
    public Emisora(String nombre_emisora, int anyo_creacion, int num_oyentes) throws CreacionInvalida {
        this.nombre_emisora = nombre_emisora.toUpperCase();
        this.identificador=num_emisoras++;
        if (anyo_creacion < 1879){
            throw new CreacionInvalida("el año de creacion debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
        this.num_oyentes = num_oyentes;
        System.out.println("Se ha creado la emisora "+identificador);
    }

    public abstract double ganancias();

    public boolean estaEmitiendo(){
        return emitiendo;
    }

    public static int getNum_emisoras() {
        return num_emisoras;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre_emisora() {
        return nombre_emisora;
    }

    public void setNombre_emisora(String nombre_emisora) {
        this.nombre_emisora = nombre_emisora.toUpperCase();
    }

    public int getAnyo_creacion() {
        return anyo_creacion;
    }

    public void setAnyo_creacion(int anyo_creacion) throws CreacionInvalida {
        if (anyo_creacion < 1879){
            throw new CreacionInvalida("el año de creacion debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
    }

    public int getNum_oyentes() {
        return num_oyentes;
    }

    public void setNum_oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
    }
}
