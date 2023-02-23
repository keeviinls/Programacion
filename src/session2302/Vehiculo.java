package session2302;

public class Vehiculo {
    private final int ANYO_ACTUAL = 2023;

    private final int KMS_POR_ANYO=15000;
    protected static int contador=0;
    protected int num_bastidor;
    protected String matricula;
    protected TipoMarca marca;
    protected String modelo;
    protected int fecha_fabricacion;
    protected int edad;
    protected int num_kms_realizados;
    protected int num_puertas;
    protected String color;
    protected int potencia;
    protected double consumo;
    protected boolean estado = false;

    public Vehiculo() {

    }

    //PONEMOS ESOS PQ SON LOS QUE EL USUARIO ME DEBE DAR

    public Vehiculo(String matricula,String marca, String modelo, int fecha_fabricacion, int num_puertas, String color, int potencia) {
        if (!esta(marca.toUpperCase())){
            throw  new MarcaInvalida("No has introducido una marca correcta")
        }

        this.num_bastidor=contador++;
        this.matricula = matricula.toUpperCase();
        this.marca = TipoMarca.valueOf(marca.toUpperCase());
        this.modelo = modelo;
        this.fecha_fabricacion = fecha_fabricacion;
        this.edad=calcular_edad();
        this.num_puertas = num_puertas;
        this.color = color;
        this.consumo=0;
        this.potencia = potencia;

    }

    private boolean esta(String marca){
        boolean esta = false;
        TipoMarca [] array_marca = new TipoMarca[6];

        if (TipoMarca.DS.toString().equals(marca) || TipoMarca.PEUGEOT.toString().equals(marca) || TipoMarca.JEEP.toString().equals(marca)
        || TipoMarca.OPEL.toString().equals(marca))


        for (int i=0;i<array_marca.length;i++){
            if (array_marca[i].equals(marca)){
                esta=true;
                break;
            }
        }
        return esta;
    }

    private int calcular_kms(){

        int kms_realizados=0;
        if (edad>0){
            kms_realizados=edad*KMS_POR_ANYO;
        }

        return kms_realizados;
    }

    public int calcular_edad(){
        return  ANYO_ACTUAL-edad;
    }
}
