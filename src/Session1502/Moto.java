package Session1502;

public class Moto extends Vehiculos {
    private int cilindrada;



    public Moto(int kilometros, String matricula, int cilindrada) {
        super(kilometros, matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    public String showInfo() {
        //VEMOS QUE HA PUESTO EL SUPER.SHOWINFO YA QUE EL EJERCICIO PIDE LLAMARLE DEL PADRE
        return (super.showInfo() +"Moto{" +
                "cilindrada=" + cilindrada +
                "} ");
    }
}
