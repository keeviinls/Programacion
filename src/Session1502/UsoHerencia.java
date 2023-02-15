package Session1502;

import java.util.Scanner;

public class UsoHerencia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cerdo cerdo1=new Cerdo(12, "jamon");
        Perro perro1=new Perro(1, "Husky");
        Gato gato1=new Gato(2, "Naranja");

        Perro perro2=null;
        System.out.println("DIme la edad del perro");
        int edad = sc.nextInt();
        System.out.println("Dime la raza del perro");
        String raza=sc.next();
        perro2=new Perro(edad,raza);

        cerdo1.saySomething();
        perro1.saySomething();
        gato1.saySomething();
        perro2.saySomething();


        System.out.println(cerdo1.showInfo());
        //VEMOS QUE EL DE PERRO NO SALE CON LAS LETRAS ESAS RARAS,
        //ES PQ EN LA CLASE PERRO, HEMOS QUITADO EL "+ super.toString()" DEL FINAL.

        System.out.println(perro1.showInfo());
        System.out.println(gato1.Showinfo());
        System.out.println(perro2.showInfo());
    }
}
