package Examen2Trimestre_CORREGIDO.Ejercicio1;

public class Inicio {
    public static void main(String[] args) throws RetencionIncorrecta, DNIInvalido {
        //crear personas
try {
    Programador programador1 = new Programador("Sofia", "55821191F", 25, "Java", "JUNIOR");
    Programador programador2 = new Programador("Kevin", "31276450S", 50, "Cesar", "SENIOR");
    Programador programador3 = new Programador("Manuel", "19639328L", 0, "Pascal", "Jefe_proyecto");
    Programador programador4 = new Programador("Hinda", "67884759Y", 30, "python", "junior");


    //crear array de programadores

    Programador[] lista_empleado = {programador1, programador2, programador3, programador4};
    //RECORRER UN ARRAY

    for (int i = 0; i < lista_empleado.length; i++) {
        System.out.println(lista_empleado[i].toString());
    }


        //FORZAR EXCEPCIONES

        //1. IllegalArgument
       // Programador programador5 = new Programador("Hinda","67884759Y",30,"python","jefe de proyecto");

        //2. DNI Invalido
      //  Programador programador6 = new Programador("Hinda","67884759Z",30,"python","jefe de proyecto");


        //3. RETENCION INCORRECTA

       // Programador programador7 = new Programador("Hinda","19639328L",60,"python","jefe de proyecto");


       /* ESTO ES UNA FORMA DE HACERLO DIRECTAMENTE
        Programador [] lista_empleado= new Programador[4];

       lista_empleado[0]=programador1;
        lista_empleado[1]=programador2;
        lista_empleado[2]=programador3;
        lista_empleado[3]=programador4;*/
}catch (Exception e){
    System.out.println(e.getMessage());
}

    }


}
