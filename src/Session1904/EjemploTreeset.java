package Session1904;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class EjemploTreeset {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto_TS_numeros = new TreeSet<>();
        conjunto_TS_numeros.add(3);
        conjunto_TS_numeros.add(2);
        conjunto_TS_numeros.add(1);
        conjunto_TS_numeros.add(4);
        conjunto_TS_numeros.add(5);

        Iterator<Integer> itr3 = conjunto_TS_numeros.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("Sacar el menor "+conjunto_TS_numeros.first());;
        System.out.println("Sacar el mayor "+conjunto_TS_numeros.last());

        System.out.println("Conjunto TreeSet menores a 3");
        SortedSet<Integer> conjunto_TS_menores = conjunto_TS_numeros.headSet(3);
        Iterator<Integer> itr4 = conjunto_TS_menores.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }

        System.out.println("Conjunto treeset descendente");
        Iterator<Integer> conjunto_TS_descendente = conjunto_TS_numeros.descendingIterator();
        while (conjunto_TS_descendente.hasNext()){
            System.out.println(conjunto_TS_descendente.next());
        }


    }
}
