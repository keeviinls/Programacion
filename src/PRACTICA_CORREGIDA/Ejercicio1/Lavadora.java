package PRACTICA_CORREGIDA.Ejercicio1;

public class Lavadora extends Electrodomestico{
    private float carga=5;

    public Lavadora() {
    }

    public Lavadora(float precio_base, float peso, float carga) {
        super(precio_base, peso);
        this.carga = carga;
    }

    public Lavadora(float precio_base, float precio_final, String color, String consumo_energetico, float peso, float carga) throws ProductoIncorrecto {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public float precioFinal(){
        precio_final=super.preciofinal();
        if (carga > 30){
            precio_final+=50;
        }

        return precio_final;
    }

}
