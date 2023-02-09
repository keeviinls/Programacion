package Session0602;

import java.util.Scanner;

public class Viajero {

    public static int contador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;

    private static int num_ojos=2;

    public Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        contador++;
    }

    public Viajero() {
        contador++;
    }

    public String getdni() {return dni; }

    public void setdni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void getInfo(Formato modo){
        String entrada="";
        Scanner sc = new Scanner(System.in);
        switch (modo){
            case normal:
                System.out.println("El dni del pasajero es "+dni);
                System.out.println("El nombre del pasajero es "+nombre);
                System.out.println("Los apellidos del pasajero son "+apellidos);
                System.out.println("La nacionalidad del pasajero es "+nacionalidad);
                System.out.println("La direccion del pasajero es "+direccion);
                break;
            case pausado:

                System.out.println("El dni del pasajero es "+dni);
                entrada=sc.nextLine();

                System.out.println("El nombre del pasajero es "+nombre);
                entrada=sc.nextLine();

                System.out.println("Los apellidos del pasajero son "+apellidos);
                entrada=sc.nextLine();

                System.out.println("La nacionalidad del pasajero es "+nacionalidad);
                entrada=sc.nextLine();

                System.out.println("La direccion del pasajero es "+direccion);
                entrada=sc.nextLine();
                break;

        }

    }
}
