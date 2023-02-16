package Session1502;

public class Coche extends Vehiculos{

    private int num_puertas;
    private int potencia;



    public Coche(int kilometros, String matricula, int potencia, int num_puertas) {
        super(kilometros, matricula);
        this.potencia = potencia;
        this.num_puertas=num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String showInfo() {
        return (super.showInfo()+"Coche{" +
                "num_puertas=" + num_puertas +
                ", potencia=" + potencia +
                "} ");
    }
}
