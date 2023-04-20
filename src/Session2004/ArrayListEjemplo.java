package Session2004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<Integer> collecion_num = new ArrayList<>();
        collecion_num.add(3);
        collecion_num.add(3);
        collecion_num.add(2);
        collecion_num.add(1);
        collecion_num.add(4);
        collecion_num.add(5);
        Iterator<Integer> itr = collecion_num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("elemento situado en primer lugar "+collecion_num.get(0));
        System.out.println("Posicion de la primera ocurrencia de 3 "+collecion_num.indexOf(1));
        System.out.println("Posicion de la ultima ocurrencia de 3 "+collecion_num.lastIndexOf(3));
        System.out.println("Tamaño de la lista "+collecion_num.size());
        System.out.println("Sublista 0-2"+collecion_num.subList(0,2).toArray());
        System.out.println("Cambiar valor de la posicion ultima "+collecion_num.set(collecion_num.size()-1,6));
        System.out.println(collecion_num.toString());
    }
}
