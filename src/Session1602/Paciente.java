package Session1602;

public class Paciente {

    private String nombre;

    private String dni;

    private int anio_i;


    public Paciente(String nombre, String dni, int anio_i) {
        this.nombre = nombre;
        this.dni = dni;
        this.anio_i = anio_i;
    }

    public Paciente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAnio_i() {
        return anio_i;
    }

    public void setAnio_i(int anio_i) {
        this.anio_i = anio_i;
    }
}
