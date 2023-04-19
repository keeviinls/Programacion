package Session1304;

import java.util.ArrayList;

public class Generica {
    public static void main(String[] args) {
        ArrayList<String> arraydinamicoString = new ArrayList<>();
        ArrayList<Integer> arraydinamicoInteger = new ArrayList<>();
        ArrayList<Persona> arraydinamicoPersona = new ArrayList<>();

        arraydinamicoString.add("Sofia");
        arraydinamicoString.add("Miguel");
        arraydinamicoString.add("Sergio");
        arraydinamicoString.add("Alejandro");
        System.out.println(arraydinamicoString.toString());


        arraydinamicoInteger.add(4);
        arraydinamicoInteger.add(5);
        arraydinamicoInteger.add(7);
        arraydinamicoInteger.add(10);
        arraydinamicoInteger.add(20);
        System.out.println(arraydinamicoInteger.toString());


        arraydinamicoPersona.add(new Persona("1234561W"));
        arraydinamicoPersona.add(new Persona("6913321K"));
        arraydinamicoPersona.add(new Persona("8727831D"));
        /**
         * El printl de Persona al principio no iba,
         * para que funcione hemos creado un metodo toString en la clase Persona.
         */
        System.out.println(arraydinamicoPersona.toString());


        Persona [] lista = new Persona[3];


    }
}
