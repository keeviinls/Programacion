package Session1502;

public class Vehiculos {
    protected int kilometros;
    protected String matricula;

    public Vehiculos() {
    }

    public Vehiculos(int kilometros, String matricula) {
        this.kilometros = kilometros;
        this.matricula = matricula;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void run(int km){
        this.kilometros = this.kilometros + km;
    }


    public String showInfo() {
        return ("Vehiculos{" +
                "kilometros=" + kilometros +
                ", matricula='" + matricula + '\'' +
                '}');
    }
}
