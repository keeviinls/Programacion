package session1002;

public class UsoHerencia {
    public static void main(String[] args) {

        //un objeto de la clase hija TAXI

        Taxi taxi=new Taxi();

        taxi.setMatricula(" 1234LCB");
        taxi.setModelo(" Skoda Fabia");
        taxi.setNumerolicencia(1456);
        taxi.setPotenciaCV(100);
        System.out.println("El taxi tiene " + "\n matricula" + taxi.getMatricula() +
                "\n modelo "+ taxi.getModelo() +
                "\n con potencia "+taxi.getPotenciaCV() +
                "\n y numero de licencia "+taxi.getNumerolicencia());

    }
}
