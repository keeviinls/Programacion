package Session0901;

public class Persona {
        //atributos
        private String dni;
        private String nombre;
        private String apellidos;

        private int edad;


        //metodos
    public Persona() //SI LO PONGO EN PRIVATE, EN LA CLASE "USO_PERSONA" NO IRIA BIEN
    {


    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //////////////////////////////////////////////
    //////////////////////////////////////////////

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /////////////////////////////////////////////
    //////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
