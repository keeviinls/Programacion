package session2202.Ejercicio1;

public class Cuenta {

    private String titular;
    private int num_cuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, int num_cuenta, double saldo) {
        this.titular = titular;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "La cuenta con numero " + num_cuenta + "tiene como titular a " + titular + "Con un saldo disponible de " + saldo + "euros";
    }

    public void ingresar(double cantidad) throws CantidadIncorrecta{

        if (cantidad<0){
        throw new CantidadIncorrecta("no se puede ingresar una cantidad negativa");
        }
        //TAMBIEN PUEDE USARSE : saldo+=cantidad
        else {
            saldo=saldo+cantidad;

        }

    }

    public void retirar(double cantidad) throws CantidadIncorrecta{
        if (saldo < cantidad){
            throw new CantidadIncorrecta("No tienes suficiente saldo disponible en cuenta");
        }
        else {
            saldo = saldo-cantidad;
        }

    }



}
