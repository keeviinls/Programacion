package EjerciciosPrepaExamen.Ejercicio2;

public class Password {

    private int longitud = 8;
    private String contraseña;

    public Password() {
    }

    public Password(int longitud, String contraseña) throws LongitudIncorrecta {
        if (longitud < 0){
            throw new LongitudIncorrecta("La longitud indicada debe ser mayor a 0");
        }
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
