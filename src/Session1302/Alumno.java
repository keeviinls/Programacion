package Session1302;

public class Alumno extends Persona {

    //aributo para la clase hija q es "Persona"
    private int beca;

    public Alumno(int beca) {
        this.beca = beca;
    }

    public Alumno(String dni, String nombre, int edad, int beca) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.beca = beca;
    }


    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "beca=" + beca +
                "} " + super.toString();
    }

    public double calcularRetencion(){
        double retencion;
        retencion=beca - beca*0.20;
        return retencion;

    }
}
