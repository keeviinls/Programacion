package Session0901;

public class Uso_persona {
    public static void main(String[] args) {
        Persona p1=new Persona();

        System.out.println("El nombre de la primera persona es " +p1.getNombre());
        System.out.println("El apellido de la primera persona es " +p1.getApellidos());
        System.out.println("El dni de la primera persona es " +p1.getDni());
        System.out.println("La edad de la primera persona es " +p1.getEdad());


        p1.setDni("12345566");
        p1.setNombre("Kevin");
        p1.setApellidos("Loayza");


        System.out.println("El nombre de la primera persona es " +p1.getNombre());
        System.out.println("El apellido de la primera persona es " +p1.getApellidos());
        System.out.println("El dni de la primera persona es " +p1.getDni());


        Persona p2 = new Persona();

        //LO MISMO QUE ARRIBA PERO CON P2.
        //p2.setDni etc...
        //p2.setNombre etc...
        //p2.setApellidos etc...
    }




}
