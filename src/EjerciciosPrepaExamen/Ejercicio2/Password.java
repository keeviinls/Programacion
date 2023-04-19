package EjerciciosPrepaExamen.Ejercicio2;

public class Password {

    private final static int LONG_DEFECTO = 8;

    private int longitud = LONG_DEFECTO;
    private String contrasenya;

    public Password() {
    }

    public Password(int longitud) throws LongitudIncorrecta, ContrasenyaIncorrecta {
        if (longitud<LONG_DEFECTO){
            throw new LongitudIncorrecta("se necesita una contraseña con una longitud minima de 8");
        }
        this.longitud = longitud;
        this.contrasenya = generarPassword();

    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenya() throws ContrasenyaIncorrecta {

        return contrasenya;
    }

    public void setLongitud(int longitud) throws LongitudIncorrecta {
        this.longitud = longitud;
        this.contrasenya=generarPassword();
    }

    public Password esFuerte() {
        boolean resultado = false;
        int cuentanumeros = 0;
        int cuentamayusculas = 0;
        int cuentaminusculas = 0;

        for (int i = 0; i < contrasenya.length(); i++) {
            if (contrasenya.charAt(i) >= 96 && contrasenya.charAt(i) >= 122) {
                cuentaminusculas++;
            } else {
                if (contrasenya.charAt(i) >= 65 && contrasenya.charAt(i) <= 90) {
                    cuentamayusculas++;
                } else {
                    cuentanumeros++;
                }
            }
        }

        if (cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2) {
            resultado = true;
            System.out.println("La contraseña es fuerte");
        } else {
            System.out.println("La contraseña es debil");
        }

        //return resultado;
        return null;
    }

    private String generarPassword() {
        String password_generada = null;
        for (int i = 0; i < longitud; i++) {
            int eleccion = (int) Math.floor(Math.random() * 3 + 1);
            if (eleccion == 1) {
                //minusculas
                char minuscula = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                // password_generada=password_generada+minuscula;
                password_generada += minuscula;
            } else if (eleccion == 2) {
                //mayusculas
                char mayuscula = (char) ((int) Math.floor((Math.random() * (91 - 65) + 65)));
                password_generada += mayuscula;

            } else {
                //3 numeros
                char numero = (char) ((int) Math.floor((Math.random() * (91 - 65) + 65)));
                password_generada += numero;

            }
        }


        return password_generada;
    }

}
