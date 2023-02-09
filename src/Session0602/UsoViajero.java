package Session0602;

import java.util.Scanner;

public class UsoViajero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1 MODALIDAD_ Objeto con constructor por defecto
        Viajero viajero1 = new Viajero();

        //2 MODALIDAD_  Objeto con constructor parametrizado metiendole los valores en duro
        Viajero viajero2 = new Viajero("12345678", "Kevin", "Loayza", "africana", "Fuenlabrada");
        System.out.println("Introduzcame su dni");
        String dni=sc.nextLine();
        System.out.println("Introduzcame su nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduzcame su apellido");
        String apellido=sc.nextLine();
        System.out.println("Introduzcame su nacionalidad");
        String nacionalidad=sc.nextLine();
        System.out.println("Introduzcame su direccion");
        String direccion=sc.nextLine();

        //3 MODALIDAD_  Objeto creado con constructor parametrizado metiendole los valores que el usuario haya introducido por teclado
        Viajero viajero3 = new Viajero(dni, nombre, apellido, nacionalidad, direccion);
        //4 MODALIDAD Obeto creado con constructor por defecto y luego con los setteres vamos dandole el valor
        Viajero viajero4=new Viajero();
        System.out.println("Introduzcame su dni");
        viajero4.setdni(sc.nextLine());

        System.out.println("Introduzcame su nombre");
        viajero4.setNombre(sc.nextLine());

        System.out.println("Introduzcame su apellidos");
        viajero4.setApellidos(sc.nextLine());

        System.out.println("Introduzcame su nacionalidad");
        viajero4.setNacionalidad(sc.nextLine());

        System.out.println("Introduzcame su direccion");
        viajero4.setDireccion(sc.nextLine());

        System.out.println("Informacion del viajero uno");
        System.out.println("El nombre del viajero es "+viajero1.getNombre());
        System.out.println("Los apellidos del viajero es "+viajero1.getApellidos());
        System.out.println("El dni del viajero es "+viajero1.getdni());
        System.out.println("La nacionalidad del viajero es "+viajero1.getNacionalidad());
        System.out.println("La direccion del viajero es "+viajero1.getDireccion());


        System.out.println("¿Cual es el formato de impresion para el viajero 2");
        Formato formato = Formato.valueOf(sc.next().toLowerCase());

        viajero2.getInfo(formato);

        System.out.println("¿Cual es el formato de impresion para el viajero 3");
        formato = Formato.valueOf(sc.next().toLowerCase());

        viajero3.getInfo(formato);

        System.out.println("¿Cual es el formato de impresion para el viajero 4");
        formato = Formato.valueOf(sc.next().toLowerCase());

        viajero4.getInfo(formato);



    }
}
