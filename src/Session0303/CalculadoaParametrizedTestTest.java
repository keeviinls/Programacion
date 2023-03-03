package Session0303;

import ArrayOperaciones.Equals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoaParametrizedTestTest {

    @ParameterizedTest
    @CsvSource({"20,5,25","10,5,10"})
    void suma(int a, int b, int valoresperado) {
        CalculadoaParametrizedTest calcu1=new CalculadoaParametrizedTest(a,b);
        double valorejecutado= calcu1.suma(a,b,valoresperado);
        assertEquals(valoresperado,valorejecutado,0);
    }

    @ParameterizedTest
    @CsvSource({"20,5,25","10,5,5"})
    void resta(int a, int b, int valoresperado) {
        CalculadoaParametrizedTest calcu1=new CalculadoaParametrizedTest(a,b);
        double valorejecutado= calcu1.resta(a,b,valoresperado);
        assertEquals(valoresperado,valorejecutado,0);
    }
}