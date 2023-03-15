package Examen2Trimestre_CORREGIDO.Ejercicio2;

public class main {
    public static void main(String[] args) throws CreacionInvalida, OpcionInvalida {
        try {
            EmisoraTradicional emisoratradicional1 = new EmisoraTradicional("Los 40", 1993, 5000, 93.9);
            EmisoraTradicional emisoratradicional2 = new EmisoraTradicional("Cadena dial", 2000, 50000, 540);
            EmisoraTradicional emisoratradicional3 = new EmisoraTradicional("Es radio", 2005, 1000, 666);

            EmisoraOnline emisoraonlinea1 = new EmisoraOnline("Radio nacional", 1985, 80000, "www.radionacional.es");
            EmisoraOnline emisoraonlinea2 = new EmisoraOnline("China FM", 2010, 6000000, "www.chinafm.es");

            emisoratradicional1.iniciarEmision();
            emisoratradicional1.finalizarEmision();


            Emisora[] lista_emisoras = {emisoraonlinea1, emisoraonlinea2, emisoratradicional1, emisoratradicional2, emisoratradicional3};
            for (int i = 0; i < lista_emisoras.length; i++) {
                System.out.println("La " + lista_emisoras[i].getClass().getSimpleName() + " tiene " + lista_emisoras[i].getNum_oyentes() + " con ganancias de " + lista_emisoras[i].ganancias());
            }

    /*    //forzar las excepciones

        //1. iniciar una emision ya iniciada

        emisoraonlinea1.iniciarEmision();
        emisoraonlinea1.iniciarEmision();

        //2. finalizar una emision ya finalizada

        emisoraonlinea1.finalizarEmision();
        emisoraonlinea1.finalizarEmision();

        //3. año de creacion de la emisora es menor a 1879

        EmisoraOnline emisoraonlinea3 = new EmisoraOnline("China FM", 1500, 6000000, "www.chinafm.es");


        //4. elegir un num_frecuencia qe no este en rango

        EmisoraTradicional emisoratradicional5 = new EmisoraTradicional("Los 40", 1500, 5000, 200);

        */
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        /* UNA FORMA DE HACERLO  Emisora[] lista_emisoras = new Emisora[5];
        lista_emisoras[0]=emisoratradicional1;
*/

    }
}
