package EjerciciosPrepaExamen.Ejercicio1;

public class main {
    public static void main(String[] args) throws EdadIncorrecta, SexoIncorrecto {
        /**
         * Crear 3 objetos persona
         */

        Persona persona1 = new Persona("kevin",21,90562386,"H",20,1.75);
        Persona persona2 = new Persona("Jona",18,29337737,"H",75,1.78);
        Persona persona3 = new Persona("Mark",20,95330127,"M",502,1.77);

        /**
         * crear array y guardar los 3 objetos creados anteriormente
         */

        Persona [] array_personas ={persona1,persona2,persona3};

        /**
         * recorrer el array e ir llamando al metodo calcularIMC
         */

        for (int i=0;i< array_personas.length;i++){
            int valor = (int) array_personas[i].calcularIMC();
            System.out.println("EL IMC de la persona +"+array_personas[i].getClass().getSimpleName()+ "Tiene un IMC de "+array_personas[i].calcularIMC());
            switch (valor){
                case 1:
                    System.out.println("Cuidado estas en sobrepeso");break;
                case 0:
                    System.out.println("Felicidades estas en tu peso ideal");break;
                case -1:
                    System.out.println("Cuidado estas al borde de la anorexia");break;
            }
        }

        /**
         * recorrer el array e ir llamando al metodo es mayor de edad
         */

        for (int i=0;i< array_personas.length;i++){
            boolean valor = array_personas[i].esMayorEdad();
            System.out.println("EL IMC de la persona +"+array_personas[i].getClass().getSimpleName()+ "Tiene un IMC de "+array_personas[i].calcularIMC());
            if (valor){
                System.out.println("Es mayor de edad");
            }
            else {
                System.out.println("Menor de edad");
            }
        }


        /**
         * recorre el array e ir llamando al metodo sobreescrito toString
         */

        for (int i=0;i<array_personas.length;i++){
            System.out.println(array_personas[i].toString());
        }

        /**
         * seccion forzar excepciones
         */

        //EDAD INCORRECTA
        Persona persona4 = new Persona("Mark",-40,95330127,"M",10,1);
        //tambien se puede con setter
        persona1.setEdad(-5);

        //SEXO INCORRECTO
        Persona persona5 = new Persona("Messi",40,95330127,"P",10,1);
        //setter
        persona2.setSexo("A");

    }
}
