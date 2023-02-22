package session2202;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadIncorrecta {

        if (edad<=0 || nombre.isEmpty()){
            throw new EdadIncorrecta("o la edad es menor o igual a 0 o el nombre lo ha indicado vacio ");
        }

        this.nombre=nombre;
        this.edad=edad;
    }
}
