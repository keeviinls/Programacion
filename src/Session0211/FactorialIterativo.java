package Session0211;

public class FactorialIterativo {
    public static long factorial (long numero){

        if (numero<0) {
            numero = numero * -1;
        }

        long factorial = 1;
        while (numero > 1){
            factorial = factorial * numero;
            numero--;
        }

        return factorial;
    }

    public static void main(String[] args) {

        System.out.println("El factorial de 3 es "+factorial(3));
    }
}

