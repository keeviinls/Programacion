package Session1904;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetPersona {
    public static void main(String[] args) {
        TreeSet<Persona> listado_personas = new TreeSet<>(Comparator.comparing(Persona::getNombre));
        listado_personas.add(new Persona("Benja","12345678D",24));
        listado_personas.add(new Persona("Carlos","12345678T",32));
        listado_personas.add(new Persona("Sofia","12345678W",38));
        listado_personas.add(new Persona("Alba","12345678P",33));


        System.out.println("Treeset Ascendente");
        Iterator<Persona> itr = listado_personas.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getNombre());
        }

        System.out.println("Treeset Descendente");

        Iterator<Persona> itr2 = listado_personas.descendingIterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next().getNombre());
        }


    }
}
