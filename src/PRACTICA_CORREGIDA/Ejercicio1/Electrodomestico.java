package PRACTICA_CORREGIDA.Ejercicio1;

public class Electrodomestico {
    protected float precio_base = 100;
    protected float precio_final;
    //El color tambien valdria con enumerado
    protected String color = "blanco";
    protected Consumo consumo_energetico = Consumo.F;
    protected float peso;

    //constructor por defecto
    public Electrodomestico() {
    }

    //constructor con precio y peso

    public Electrodomestico(float precio_base, float peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    //constructor con todos los atributos


    public Electrodomestico(float precio_base, float precio_final, String color, Consumo consumo_energetico, float peso) throws ProductoIncorrecto {
        this.precio_base = precio_base;
        this.precio_final = precio_final;
        if (comprobarColor(color)){
            this.color=color;
        }
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public float getPrecio_final() {
        return precio_final;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws ProductoIncorrecto {
        if (comprobarColor(color)){
            this.color=color;
        }

    }
    public boolean comprobarColor(String color) throws ProductoIncorrecto {
        if (color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")){
            return  true;
        }
        else {
            throw new ProductoIncorrecto("ese color no esta dentro de la gama");
        }
    }

    public boolean comprobarConsumoEnergetico(char letra){
        boolean resultado=false;
        if (Consumo.A.toString().equals(letra) && precio_base>=100 || Consumo.B.toString().equals(letra) && precio_base>=80 && precio_base < 100
           || Consumo.C.toString().equals(letra) && precio_base >=60 && precio_base < 80
            || Consumo.D.toString().equals(letra) && precio_base >=50 && precio_base < 60
                || Consumo.E.toString().equals(letra) && precio_base >=30 && precio_base < 50
                || Consumo.F.toString().equals(letra) && precio_base >=10 && precio_base < 30
        ){
            resultado = true;
        }
        return resultado;
    }

}
