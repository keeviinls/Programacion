package Session1502;

public class Uso_Vehiculos {
    public static void main(String[] args) {
        Coche coche1 = new Coche(1200, "LPGC 123", 213, 5);
        Moto moto1 = new Moto(50000, "KLS2804", 5000);
        Camion camion1 = new Camion(999900, "LM1018", 5);

        System.out.println(coche1.showInfo());
        System.out.println(moto1.showInfo());
        System.out.println(camion1.showInfo());

    }
}
