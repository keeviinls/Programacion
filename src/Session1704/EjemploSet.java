package Session1704;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EjemploSet {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pia");
        nombres.add(null);

        System.out.println("Conjunto Hashset");
        Iterator<String> itr1 = nombres.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }


        System.out.println("El numero de elementos "+nombres.size());
        nombres.clear();
        System.out.println("El numero de elementos "+nombres.size());

        LinkedHashSet<String> conjunto_LHS_nombre = new LinkedHashSet<>();

        nombres.add("Juan");
        nombres.add("Pia");
        nombres.add(null);
        System.out.println("Conjunto LinkedHashset");
        Iterator<String> itr2 = conjunto_LHS_nombre.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
