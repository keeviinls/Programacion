package Session1502;

public class Gato extends Animales{

    //atributos

    private String color;

    public Gato(int edad, String color){
        this.edad=edad;
        this.color=color;
    }


    public void saySomething(){
        System.out.println("miau, miau");
    }

    public String Showinfo() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
    }
}
