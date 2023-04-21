package Session2104;

import java.util.Stack;

public class EjemploStack {
    public static void main(String[] args) {
        Stack<String> ps = new Stack<>();
        System.out.println("es vacio "+ps.empty());
        ps.add("sofia");
        ps.add("maria");
        ps.add("juana");
        System.out.println("es vacio "+ps.empty());
        System.out.println(ps.toString());
        System.out.println("cima pila "+ps.pop());
        System.out.println("Desapilo "+ps.pop());
        System.out.println("Apilo "+ps.push("juan"));
        System.out.println(ps.toString());
        System.out.println("eltos de la pila "+ps.size());

    }
}
