package Session1904;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetJugadores {

    HashSet<Jugador> FCBetis = new HashSet<>();
    HashSet<Jugador> conjunto2 = new HashSet<>();

    public void initialize(){

        FCBetis.add ( new Jugador("luiz felipe", 24, "DEFENSA"));
        System.out.println("Coleccion insertada correctamente");
    }

     public void add(Jugador jugador){
         FCBetis.add(jugador);
     }

     public void showBetis(){
         Iterator<Jugador> itr1 = FCBetis.iterator();
         while (itr1.hasNext()){
             System.out.println(itr1.next().toString());
         }
     }

     public boolean contains(Jugador jugador){
         boolean esta = false;
         if (FCBetis.contains(jugador)){
             esta=true;
         }

         return esta;
     }

     public void add2(){
         conjunto2.add(new Jugador("kevin", 21, "CENTROCAMPISTA"));
     }

     public void compare(){
         if (FCBetis.containsAll(conjunto2)){
             System.out.println("Los jugadores del conjunto 2 estan contenidos");
         }

         else {
             System.out.println("Los jugadores no estan contenidos");
         }
     }

     public void merge(){
         FCBetis.addAll(conjunto2);
     }

     public void remove(){
         FCBetis.clear();
     }

}
