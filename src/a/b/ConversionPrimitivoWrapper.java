package a.b;

public class ConversionPrimitivoWrapper {

    public static void main(String[] args) {

    //declaracion de variables
    Integer a = 6;
    int b = 7;
    int c = 8;
    Integer d = 9;

    System.out.println("el valor de la variable Wrapper a es: "+a);
    System.out.println("el valor de la variable tipo primitivo int b es: "+b);
    System.out.println("el valor de la variable tipo primitivo int c es: "+c);


    // vamos a Autoboxing

    System.out.println("Autoboxing");
    a=b;
    System.out.println("la variable wrapper a vale ahora"+b);

    //vamos a Autoboxing
    System.out.println("Unboxing");
    c=a;

    System.out.println("la variable tipo primitivo int c vale ahora"+a);

    //Beneficios de usar calses envoltorio a wrappers
    System.out.println("este metodo permite pasar una variable de tipo Integer a string "+a.toString());
    System.out.println("es " +a+ "igual a=> "+b + a.equals(b));
    System.out.println("es a igual a b => "+a.equals(d));
    System.out.println("convertir la variable b en float "+d.floatValue());


    }//fin del main

}//fin de la clase
