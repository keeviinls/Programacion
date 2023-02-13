package Session1302;

public class UsoHerencia {
    public static void main(String[] args) {

        Alumno alu1=new Alumno("123124412A", "DIEGO", 19, 1000);

        System.out.println("El alumno tiene "+
                " el dni "+alu1.getDni()+ " con nombre "+alu1.getNombre() +
                " con edad "
                + alu1.getEdad() + " y ha recibido una beca de "
                +alu1.getBeca()+ " Euros");

        System.out.println("El Toststring del alumno es " +alu1.toString());
        Profesor profe1=new Profesor("22222k", "Manuel", 30, 15000 );

        System.out.println("El dni del profe es "+profe1.getDni() +
                " con nombre "+profe1.getNombre()+
                " que tiene "+profe1.getEdad() +
                " años y itene un sueldo de "+profe1.getSalario());

        System.out.println("El Toststring del profesor es " +profe1.toString());

    }
}
