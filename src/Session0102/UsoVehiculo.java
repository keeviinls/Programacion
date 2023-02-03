package Session0102;

public class UsoVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1=new Vehiculo();
        System.out.println("El vehiculo uno es de la marca "+vehiculo1.getMarca());

        System.out.println("El vehiculo uno es de color "+vehiculo1.getColor());

        System.out.println("El vehiculo uno tiene una placa "+vehiculo1.getPlaca());

        System.out.println("El vehiculo uno es del modelo "+vehiculo1.getModelo());

        System.out.println("El vehiculo uno tiene como referncia "+vehiculo1.getReferencia());

        System.out.println("El vehiculo uno tiene un valor "+vehiculo1.getValor());

        System.out.println("El vehiculo uno tiene una velocidad de "+vehiculo1.getVelocidad());

        System.out.println("El vehiculo uno usa la marcha  "+vehiculo1.getMarcha());
        vehiculo1.apagar();

        System.out.println("==========================================================");
        System.out.println("==========================================================");



        Vehiculo vehiculo2=new Vehiculo(Marca.AUDI, "AUDI A3", 1, "1234LCB", "gris", 27000 );
        System.out.println("El vehiculo uno es de la marca "+vehiculo2.getMarca());

        System.out.println("El vehiculo uno es de color "+vehiculo2.getColor());

        System.out.println("El vehiculo uno tiene una placa "+vehiculo2.getPlaca());

        System.out.println("El vehiculo uno es del modelo "+vehiculo2.getModelo());

        System.out.println("El vehiculo uno tiene la referncia "+vehiculo2.getReferencia());

        System.out.println("El vehiculo uno tiene un valor"+vehiculo2.getValor());

        System.out.println("El vehiculo uno tiene una velocidad de "+vehiculo2.getVelocidad());

        System.out.println("El vehiculo uno usa la marcha  "+vehiculo2.getMarcha());
        vehiculo2.acelerar(20);
        vehiculo2.cambiarmarcha(2);
        vehiculo2.cambiarmarcha(9);
        vehiculo2.frenar(10);
        vehiculo2.cambiarmarcha(1);
        vehiculo2.apagar();
    }
}
