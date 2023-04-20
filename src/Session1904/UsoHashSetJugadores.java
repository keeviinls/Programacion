package Session1904;

import java.util.ArrayList;
import java.util.Arrays;

public class UsoHashSetJugadores {
    public static void main(String[] args) {
        HashsetJugadores obj = new HashsetJugadores();
        obj.initialize();


        Jugador jugador = new Jugador("bernat", 35, "CENTROCAMPISTA");
        obj.add(jugador);
        if (obj.contains(jugador)){
            System.out.println("El jugador esta contenido");
        }

        else {
            System.out.println("El jugador NO esta contenido");
        }
        System.out.println("Añadir nuevo conjunto");
        obj.add2();
        System.out.println("Unir ambos conjuntos");
        obj.merge();
        System.out.println("Mostrar ambos conjuntos");
        obj.showBetis();

        ArrayList<Integer> ali = new ArrayList<>();

    }
}
