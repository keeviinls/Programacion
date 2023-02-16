package Session1602;

public class Paciente extends Medico {

    protected String nombre;

    protected String dni;

    public Paciente(String nombre, String apellido, int n_colegiado, Paciente[] lista_pacientes, String nombre1, String dni) {
        super(nombre, apellido, n_colegiado, lista_pacientes);
        this.nombre = nombre1;
        this.dni = dni;
    }


}
