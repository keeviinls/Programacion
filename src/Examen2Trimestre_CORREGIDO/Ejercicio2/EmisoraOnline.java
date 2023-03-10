package Examen2Trimestre_CORREGIDO.Ejercicio2;

public class EmisoraOnline extends Emisora implements Emitible{

    private static final double GANANCIA_POR_OYENTE=0.023;
    private String url;

    public EmisoraOnline(String nombre_emisora, int anyo_creacion, int num_oyentes, String url) throws CreacionInvalida {
        super(nombre_emisora, anyo_creacion, num_oyentes);
        this.url = url;
    }

    public double ganancias(){
        return num_oyentes*GANANCIA_POR_OYENTE;
    }

    public void iniciarEmision() throws OpcionInvalida{
        if (emitiendo){
            throw new OpcionInvalida("no se puede iniciar una emision ya iniciada");
        }
        emitiendo=true;
    }

    public void finalizarEmision() throws OpcionInvalida{
        if (!emitiendo){
            throw new OpcionInvalida("no se puede finalizar una emision ya finalizada");
        }
        System.out.println("Finalizando la emision "+nombre_emisora+" en "+url);
        emitiendo=false;
    }
}
