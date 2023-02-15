package Session1502;

public class Perro extends Animales{

    //atributos

    private String raza;

    public Perro(int edad, String raza){
        this.edad=edad;
        this.raza=raza;
    }

    public void saySomething(){
        System.out.println("guau , guau");
    }

    public String showInfo() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                "} ";
    }
}
