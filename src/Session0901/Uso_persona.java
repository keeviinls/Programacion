package Session0901;

public class Uso_persona {
    public static void main(String[] args) {
        Persona p1=new Persona();

        System.out.println("El nombre de la primera persona es " +p1.getNombre());
        System.out.println("El apellido de la primera persona es " +p1.getApellidos());
        System.out.println("El dni de la primera persona es " +p1.getDni());
        System.out.println("La edad de la primera persona es " +p1.getEdad());
        System.out.println("/////////////////////////////////////////////////////");

        p1.setDni("12345566");
        p1.setNombre("Kevin");
        p1.setApellidos("Loayza");
        p1.setEdad(22);

        System.out.println("/////////////////////////////////////////////////////");

        System.out.println("El nombre de la primera persona es " +p1.getNombre());
        System.out.println("El apellido de la primera persona es " +p1.getApellidos());
        System.out.println("El dni de la primera persona es " +p1.getDni());
        System.out.println("La edad de la primera persona es "+p1.getEdad());
        System.out.println("//////////////////////////////////////////////////////");

        Persona p2 = new Persona("Sofia", "1223131231", "Bermejo", 32);
        System.out.println("El nombre de la segunda persona es "+p2.getNombre());
        System.out.println("El apellido de la segunda persona es "+p2.getApellidos());
        System.out.println("El dni de la segunda persona es "+p2.getDni());
        System.out.println("La edad de la segunda persona es "+p2.getEdad());
        System.out.println("El numero de objetos de la clase persona creados es "+Persona.contador);




        //LO MISMO QUE ARRIBA PERO CON P2.
        //p2.setDni etc...
        //p2.setNombre etc...
        //p2.setApellidos etc...
    }




}
