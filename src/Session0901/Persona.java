package Session0901;

public class Persona {
        //atributos
        private String dni;
        private String nombre;
        private String apellidos;


        //metodos
    public Persona() //SI LO PONGO EN PRIVATE, EN LA CLASE "USO_PERSONA" NO IRIA BIEN
    {
        apellidos="Loayza";
    }

    public String getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }
}
