package session0202;

import Session0102.Marca;

public class Editorial {
    private int codigo;
    private String nombre;
    private int año;

    //1º constructor: el de defecto

    public Editorial(){



    }

    public Editorial(int codigo, String nombre, int año){

        this.codigo=codigo;
        this.nombre=nombre;
        this.año=año;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
