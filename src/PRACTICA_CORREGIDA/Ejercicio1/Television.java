package PRACTICA_CORREGIDA.Ejercicio1;

public class Television extends Electrodomestico{
    /** atributos de la clase hija de Television */
    private int resolucion;
    private boolean tdt;

    /** la clase television tiene tres constructores */


    public Television() {
    }

    /***
     *
     * @param precio_base
     * @param peso
     * @param resolucion
     * @param tdt
     */

    public Television(float precio_base, float peso, int resolucion, boolean tdt) {
        super(precio_base, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Television(float precio_base, float precio_final, String color, String consumo_energetico, float peso, int resolucion, boolean tdt) throws ProductoIncorrecto {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public float precioFinal(){
        float resultado=0;
        resultado=super.preciofinal();
        if (resolucion > 40){
            resultado = (float) (resultado+resultado*0.3);
        }
        if (isTdt()){
            resultado+=50;
        }
        return resultado;
    }
}
