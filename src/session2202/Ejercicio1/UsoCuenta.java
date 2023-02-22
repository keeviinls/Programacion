package session2202.Ejercicio1;

public class UsoCuenta {
    //PARA QUITAR EL ERROR VALE CON CREAR LOS "TRY" Y "CATCH" O MEJOR
    //TAMBIEN VALE CON PONE COMO DEBAJO EL THROWS CANTIDADINCORRECTA DEPUES DEL VOID
    // public static void main(String[] args)  throws CantidadIncorrecta {
    public static void main(String[] args)  {
        try {
            Cuenta cuenta1 = new Cuenta("Sofia", 12345, 2000.15);
            System.out.println(cuenta1.toString());
            cuenta1.ingresar(1200);
            System.out.println(cuenta1.toString());
            cuenta1.retirar(6000);
        }

        catch (CantidadIncorrecta e){
            System.out.println(e.getMessage());
        }
    }

}
