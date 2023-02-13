package Session1302;

public class Profesor extends Persona {

    private int salario;


    public Profesor(String dni, String nombre, int edad, int salario) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //GENERATE, TOSTING, ARRIBA LA OPCION DE STRING CONCAT AND SUPER,STRING.


    //Esta hecho a mano, es otra forma
    @Override
    public String toString() {
        //ESTO ESTABA EN ROJO, PERO SI PONEMOS LO DE "PERSONA" EN LUGAR DE PRIVADO
        //LO PONEMOS EN PROTECTED, PUES SI DEJARIA.
        return "Profesor -> DNI: "+dni+"->nombre"+nombre+"-> edad "+edad + "-> salario "+salario;
    }

    public double calcularRetencion(){
        double retencion;
        retencion=salario*0.20;
        return retencion;
    }



}
