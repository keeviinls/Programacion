package Session1502;

public class Camion extends Vehiculos{

    private int ejes;

    public Camion(int kilometros, String matricula, int ejes) {
        super(kilometros, matricula);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }


    public String showInfo() {
        return (super.showInfo()+"Camion{" +
                "ejes=" + ejes +
                "} ") ;
    }
}
