package Examen2Trimestre_CORREGIDO.Ejercicio2;


public class EmisoraTradicional extends Emisora{
    private Frecuencia frecuencia; //AM,FM
    private double num_frecuencia;
    private static final double GANACIAS_POR_OYENTE=0.023;
    //constructor


    public EmisoraTradicional(String nombre_emisora, int anyo_creacion, int num_oyentes, double num_frecuencia) throws CreacionInvalida {
        super(nombre_emisora, anyo_creacion, num_oyentes);
        if (num_frecuencia>=540 && num_frecuencia<1600){
            this.frecuencia = Frecuencia.AM;

        }
        else if (num_frecuencia>88.1 && num_frecuencia<108.1){
            this.frecuencia=Frecuencia.FM;
        }

        else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }

        this.num_frecuencia=num_frecuencia;
    }
    public double ganancias(){
        double resultado=0;
        resultado=num_oyentes*GANACIAS_POR_OYENTE;

        return resultado;
    }

    public void iniciarEmision() throws OpcionInvalida{
        if (emitiendo){
            throw new OpcionInvalida("no se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciadno la emision de "+nombre_emisora+ " en "+num_frecuencia);
        emitiendo=true;
    }

    public void finalizarEmision() throws OpcionInvalida{
        if (!emitiendo){
            throw new OpcionInvalida("no se puede finalizar una emision ya finalizada");
        }
        System.out.println("Finalizando la emision "+nombre_emisora+" en "+num_frecuencia);
        emitiendo=false;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public double getNum_frecuencia() {
        return num_frecuencia;
    }

    public void setNum_frecuencia(double num_frecuencia) {
        if (num_frecuencia>=540 && num_frecuencia<1600){
            this.frecuencia = Frecuencia.AM;

        }
        else if (num_frecuencia>88.1 && num_frecuencia<108.1){
            this.frecuencia=Frecuencia.FM;
        }

        else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }

        this.num_frecuencia=num_frecuencia;
    }
}
