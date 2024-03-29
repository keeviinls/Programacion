package session0202;

public class Planeta {
    //variable de clase compartida por todos los objetos

    public static int contador = 0;


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

    public Planeta() {

        this.nombre = null;
        this.satelites = 0;
        this.masa = 0;
        this.volumen = 0;
        this.diametro = 0;
        this.distancia_sol = 0;
        this.observable = false;
        contador++;

    }


    // 2º constructor: el parametrizado

    public Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distancia_sol, Tipo_Planeta tipo_planeta, boolean observable) {

        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo_planeta = tipo_planeta;
        this.observable = observable;
        contador++;
    }

    //metodo calcular densidad

    //VEMOS QUE AL CREAR EL METODO NO HACE FALTA LLAMAR A LOS ATRIBUTOS.
    public double calcularDensidad() {
        double resultado = 0;
        resultado = masa / volumen;
        return resultado;
    }

    //metodo es planeta exterior

    public boolean esPlanetaExterior() {
        boolean esExterior=false;
        float limite = (float) (149597870 * 3.4);
        if (distancia_sol>limite){
            esExterior= true;
        }
        return esExterior;
    }

    //polimorfismo de sobrescritura de metodos

    public void imprimir(){

        System.out.println("El nombre del planeta es "+this.nombre);
        System.out.println("La cantidad de satelites es "+this.satelites);
        System.out.println("La masa del planeta es "+masa);
        System.out.println("El volumene es "+volumen);
        System.out.println("El diametro es "+ diametro);
        System.out.println("La distancia es "+distancia_sol);
        System.out.println("Es observable?" + observable);
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", satelites=" + satelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distancia_sol=" + distancia_sol +
                ", tipo_planeta=" + tipo_planeta +
                ", observable=" + observable +
                '}';
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
