package Session1502;

public abstract class Animales {
//NO CREAMOS CONSTRUCTORES PQ ESTA CLASE ES ABSTRACTA
    protected int edad;
//LO PONEMOS EN PROTECTED ASI TAMBIEN LO VE LA CALSE PERRO Y LAS DEMAS

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void saySomething();
}


