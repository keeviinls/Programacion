package Session0102;

import java.util.Scanner;

public class Vehiculo {


    //# = protected o protegido
    //- = privado
    // + = publico

    //atributos
// son todas private pq tiene el simbolo -, aparece asi en el ejercicio 2 del word.//
    private Marca marca;
    private String referencia;
    private int modelo;
    private String placa;
    private String color;
    private int valor;
    private int velocidad;
    private int marcha;

    //1º constructor: el de defecto

    public Vehiculo(){



    }

    // 2º constructor: el parametrizado

    //NO PODEMOS EL INT VELOCIDAD NI INT MARCHA PQ PENSABMOS QUE POR DEFECTO LA VELOCIDAD Y MARCHA EMPIEZAN EN 0 PQ EL COCHE ESTA APAGADO
    public Vehiculo(Marca marca, String referencia, int modelo, String placa, String color, int valor){

        this.marca=marca;
        this.referencia=referencia;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
        this.valor=valor;
        this.velocidad=0;
        this.marcha=0;

    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void acelerar(int velocidad){
        System.out.println("El coche esta acelerando a "+velocidad+ "km/h");
        this.velocidad=this.velocidad+velocidad;
    }

    public void frenar(int velocidad){
        System.out.println("El coche esta ralentizando la velocidad a "+velocidad+"km/h");
        this.velocidad=this.velocidad-velocidad;
    }

    public void cambiarmarcha(int marcha){

        if (this.marcha==marcha){
            System.out.println("Estas en marcha. No podemos cambiar");
        }
        else if (marcha>7){
            System.out.println("No existe esa marcha en el coche");
        }
        else {
            System.out.println("Cambiado a "+marcha);
            this.marcha=marcha;
        }

    }

    public void apagar(){
        System.out.println("Apagando el coche.......");
        this.velocidad=0;
        this.marcha=1;
    }



}
