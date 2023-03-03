package Session0303;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        double valorEsperado=200;
        Calculadora calcu1=new Calculadora(100,100);
        double valorEjecutado= calcu1.sumar(100,100);
        assertEquals(valorEsperado,valorEjecutado,0);//EL 0 INDICA QUE NO ADMITE FALLOS, TIENE QUE SER IGUAL

    }

    @org.junit.jupiter.api.Test
    void restar() {

        double valorEsperado=50;
        Calculadora calcu1=new Calculadora(100,50);
        double valorEjecutado= calcu1.restar(100,50);
        assertEquals(valorEsperado,valorEjecutado,0);//EL 0 INDICA QUE NO ADMITE FALLOS, TIENE QUE SER IGUAL


    }

    @org.junit.jupiter.api.Test
    void multiplicar() {

        double valorEsperado=10;
        Calculadora calcu1=new Calculadora(5,2);
        double valorEjecutado= calcu1.multiplicar(5,2);
        assertEquals(valorEsperado,valorEjecutado,0);//EL 0 INDICA QUE NO ADMITE FALLOS, TIENE QUE SER IGUAL

    }

    @org.junit.jupiter.api.Test
    void dividir_ok() {
        double valorEsperado=100;
        Calculadora calcu1=new Calculadora(200,2);
        double valorEjecutado= calcu1.dividir(200,2);
        assertEquals(valorEsperado,valorEjecutado,0);//EL 0 INDICA QUE NO ADMITE FALLOS, TIENE QUE SER IGUAL

    }

    @org.junit.jupiter.api.Test
    void dividir_ko() {
        Calculadora calcu1=new Calculadora(10,0);
        Assertions.assertThrows(ArithmeticException.class,()->calcu1.dividir(10,0));
    }


}