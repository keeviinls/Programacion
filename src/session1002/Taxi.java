package session1002;
//MUESTRA DISEÑO EN POWER POINT DEL 4.2 (DIAPOSITIVA 11)
//RECORDEMOS QUE TAXI HEREDA DE VEHICULO

public class Taxi extends Vehiculo{
    private int numerolicencia;

    public int getNumerolicencia() {
        return numerolicencia;
    }

    public void setNumerolicencia(int numerolicencia) {
        this.numerolicencia = numerolicencia;
    }
}
