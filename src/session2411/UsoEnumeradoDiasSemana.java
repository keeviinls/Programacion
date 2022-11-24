package session2411;



import java.util.Scanner;


public class UsoEnumeradoDiasSemana {
    public static void main(String[] args) {

        int valor =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un valor de 1 a 7");
        valor = sc.nextInt();
        diasemana dia = diasemana.Lunes;
        switch (valor){
            case 1: System.out.println("es"+dia.Lunes); break;
            case 2: System.out.println("es"+dia.Martes); break;
            case 3: System.out.println("es"+dia.Miercoles); break;
            case 4: System.out.println("es"+dia.Jueves); break;
            case 5: System.out.println("es"+dia.Viernes); break;
            case 6: System.out.println("es"+dia.Sabado); break;
            case 7: System.out.println("es"+dia.Domingo); break;
            default: System.out.println( "no se ha introducido el numero correcto");
       }
    }
}
