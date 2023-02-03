package session0202;

public class Planeta {
    //variable de clase compartida por todos los objetos

    public static int contador=0;


    //TAMIBEN SE PUEDE PONER EL VALOR AQUI, LO DE NULL, 0 ETC...

    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private int diametro;

    //Tambien se puede crear enumerado asi:
    //enum tipoplaneta {GASEOSO,TERRESTRE,ENANO},
    private int distancia_sol;
    private Tipo_Planeta tipo_planeta;
    private boolean observable;

    //1º constructor: el de defecto

    public Planeta(){

        this.nombre=null;
        this.satelites=0;
        this.masa=0;
        this.volumen=0;
        this.diametro=0;
        this.distancia_sol=0;
        this.observable=false;
        contador++;

    }


    // 2º constructor: el parametrizado

    public Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distancia_sol, Tipo_Planeta tipo_planeta, boolean observable){

        this.nombre=nombre;
        this.satelites=satelites;
        this.masa=masa;
        this.volumen=volumen;
        this.diametro=diametro;
        this.distancia_sol=distancia_sol;
        this.tipo_planeta=tipo_planeta;
        this.observable=observable;
    }

    //polimorfismo de sobrescritura de metodos
    @Override
    public String ToString(){

        return "Nombre "+this.nombre+"Satelites "+this.satelites+"Masa "+this.masa+"Diametros "+this.diametro+"Distancia AL SOL " +this.distancia_sol+"Observable "+this.observable;
    }

    public void imprimir(){
        System.out.println("El nombre del planeta es "+this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public Tipo_Planeta getTipo_planeta() {
        return tipo_planeta;
    }

    public void setTipo_planeta(Tipo_Planeta tipo_planeta) {
        this.tipo_planeta = tipo_planeta;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }
}
