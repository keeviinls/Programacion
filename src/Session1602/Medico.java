package Session1602;

import java.util.Arrays;

public class Medico {

    protected String nombre;

    protected String apellido;

    protected int n_colegiado;

    protected Paciente[] lista_pacientes;

    public Medico(String nombre, String apellido, int n_colegiado, Paciente[] lista_pacientes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_colegiado = n_colegiado;
        this.lista_pacientes = lista_pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getN_colegiado() {
        return n_colegiado;
    }

    public void setN_colegiado(int n_colegiado) {
        this.n_colegiado = n_colegiado;
    }

    public Paciente[] getLista_pacientes() {
        return lista_pacientes;
    }

    public void setLista_pacientes(Paciente[] lista_pacientes) {
        this.lista_pacientes = lista_pacientes;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", n_colegiado=" + n_colegiado +
                ", lista_pacientes=" + Arrays.toString(lista_pacientes) +
                '}';
    }
}
