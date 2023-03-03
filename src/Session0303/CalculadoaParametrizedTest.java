package Session0303;

public class CalculadoaParametrizedTest {
    //atributos
    private int num1;
    private int num2;

    //Constructor

    public CalculadoaParametrizedTest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma(int num1, int num2,int valresperado){
        valresperado=num1+num2;
        return valresperado;
    }

    public int resta(int num1, int num2,int valresperado){
        valresperado=num1-num2;
        return valresperado;
    }
}
