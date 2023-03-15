package PRACTICA_CORREGIDA.Ejercicio2;

public class Cuadrado extends Figura implements IAcciones{

    //atributos
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado) throws ExcepcionCuadrado {
        if (lado<0){
            throw new ExcepcionCuadrado("un lado no puede ser igual o menor a 0");
        }
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) throws ExcepcionCuadrado {
        if (lado<0){
            throw new ExcepcionCuadrado("un lado no puede ser igual o menor a 0");
        }
        this.lado = lado;
    }

    public double volumen(){
        return Math.pow(lado,3);
    };
    public double area(){
        return lado*lado;

    };

    public void dibujar(){
        System.out.println("------------");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("------------");


    };


}
