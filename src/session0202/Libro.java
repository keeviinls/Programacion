package session0202;

import Session0102.Marca;

public class Libro {

    private String isbn;

    private String titulo;

    private int anio;

    private int precio;

    private Editorial editorial;


    //1º constructor: el de defecto

    public Libro(){


    }

    // 2º constructor: el parametrizado


    public Libro(String isbn, String titulo, int anio, int precio, Editorial editorial){

        this.isbn=isbn;
        this.titulo=titulo;
        this.anio=anio;
        this.precio=precio;
        this.editorial=editorial;

    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}



