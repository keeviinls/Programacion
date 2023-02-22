package session2202;

public class UsoPersona {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Kevin", 0);
        }
        catch (EdadIncorrecta e){
            System.out.println(e.getMessage());
        }
    }
}
