package PRACTICA_CORREGIDA.Ejercicio1;

public abstract class Electrodomestico {
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


    public Electrodomestico(float precio_base, float precio_final, String color, String consumo_energetico, float peso) throws ProductoIncorrecto {
        if (comprobarConsumoEnergetico(consumo_energetico.toUpperCase().charAt(0)))
        {
            this.precio_base = precio_base;
            this.consumo_energetico=Consumo.valueOf(consumo_energetico.toUpperCase());
        }
        else {
            throw new ProductoIncorrecto("No es correcta la letra con el precio");
        }
        this.precio_final = precio_final;
        if (comprobarColor(color)){
            this.color=color;
        }
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

    public float preciofinal(){
        float resultado = 0;
        switch (consumo_energetico){
            case A: precio_final = precio_base + 100;break;
            case B: precio_final = precio_base + 80;break;
            case C: precio_final = precio_base + 60;break;
            case D: precio_final = precio_base + 50;break;
            case E: precio_final = precio_base + 30;break;
            case F: precio_final = precio_base + 10;break;

        }
        if (peso > 0 && peso <=19){
            precio_final += 10;
        }
        else if (peso >= 20 && peso <=49) {
            precio_final+=50;
        }
        else if (peso >= 50 && peso <=79) {
            precio_final+=80;
        }
        else{
            precio_final +=100;
        }

        return resultado;
    }

    public abstract float precioFinal();
}
