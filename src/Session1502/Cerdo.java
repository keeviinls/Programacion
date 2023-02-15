package Session1502;

public class Cerdo extends Animales{

    //atributos

    private String alimentacion;

    public Cerdo(int edad, String alimentacion){
        this.edad=edad;
        this.alimentacion=alimentacion;
    }

    public void saySomething(){
        System.out.println("oink, oink");
    }


    public String showInfo() {
        return "Cerdo{" +
                "alimentacion='" + alimentacion + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
    }
}
