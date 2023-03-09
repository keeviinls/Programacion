package Examen2Trimestre_CORREGIDO.Ejercicio1;

//SE PONE FINAL PQ PONE QUE ESTA CLASE SE CONSIDERA PERFECTA
public final class Programador {

    //atributos
    private String nombre;
    private String dni;
    private double SalarioBase;
    private int retencion;
    private double SalarioNeto;
    private String lenguaje_programacion;
    private Categoria categoria;

    //CONSTRUCTOR POR DEFECTO
    public Programador() {
    }

    public Programador(String nombre, String dni, int retencion, String lenguaje_programacion, String categoria) throws DNIInvalido, RetencionIncorrecta {
        this.nombre = nombre.toLowerCase();

        if (!verificar_dni(dni.toUpperCase())){
            throw new DNIInvalido("la letra del DNI no corresponde con la enumeracion");
        }
        this.dni = dni.toUpperCase();
        if (retencion<0||retencion>50){
            throw new RetencionIncorrecta("la retencion tiene que estar comprendida entre 0 y 50");
        }

        this.retencion = retencion;
        this.lenguaje_programacion = lenguaje_programacion.toUpperCase();
        if (!Categoria.junior.toString().equals(categoria.toLowerCase())&&!Categoria.senior.toString().equals(categoria.toLowerCase())&&!Categoria.jefe_proyecto.toString().equals(categoria.toLowerCase())){
            throw new IllegalArgumentException("La categoria no es correcta");
        }


    this.categoria=Categoria.valueOf(categoria.toLowerCase());
    if(Categoria.junior.toString().equals(categoria.toLowerCase())){
        this.SalarioBase=18000;
    } else if (Categoria.senior.toString().equals(categoria.toLowerCase())) {
        this.SalarioBase=27000;
    }
    else {
        this.SalarioBase=35000;
    }

    this.SalarioNeto=calcularSalarioNeto();

    }

    private double calcularSalarioNeto() {
        return SalarioBase-SalarioBase*(retencion/100);
    }

    private boolean verificar_dni(String dni) {

        boolean esvalido=false;
        Integer numero=Integer.parseInt(dni.substring(0,dni.length()-1));
        Integer resto = numero%23;
        char letra_metida=dni.charAt(dni.length()-1);
        char letra_supuesta=0;

        switch (resto){

            case 0: letra_supuesta='T';break;
            case 1: letra_supuesta='R';break;
            case 2: letra_supuesta='W';break;
            case 3: letra_supuesta='A';break;
            case 4: letra_supuesta='G';break;
            case 5: letra_supuesta='M';break;
            case 6: letra_supuesta='Y';break;
            case 7: letra_supuesta='F';break;
            case 8: letra_supuesta='P';break;
            case 9: letra_supuesta='D';break;
            case 10: letra_supuesta='X';break;
            case 11: letra_supuesta='B';break;
            case 12: letra_supuesta='N';break;
            case 13: letra_supuesta='J';break;
            case 14: letra_supuesta='Z';break;
            case 15: letra_supuesta='S';break;
            case 16: letra_supuesta='Q';break;
            case 17: letra_supuesta='V';break;
            case 18: letra_supuesta='H';break;
            case 19: letra_supuesta='L';break;
            case 20: letra_supuesta='C';break;
            case 21: letra_supuesta='K';break;
            case 22: letra_supuesta='E';break;
        }

        if (letra_metida==letra_supuesta){
            esvalido=true;
        }

        return esvalido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DNIInvalido {
        if (!verificar_dni(dni)){
            throw new DNIInvalido("La letra del DNI no corresponde con la numeracion");
        }
        this.dni = dni.toUpperCase();
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) throws RetencionIncorrecta {
        if (retencion<0||retencion>50){
            throw new RetencionIncorrecta("la retencion tiene que estar comprendida entre 0 y 50");
        }
        this.retencion = retencion;
    }


    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public void setLenguaje_programacion(String lenguaje_programacion) {
        this.lenguaje_programacion = lenguaje_programacion.toUpperCase();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (!Categoria.junior.toString().equals(categoria.toLowerCase())&&!Categoria.senior.toString().equals(categoria.toLowerCase())&&!Categoria.jefe_proyecto.toString().equals(categoria.toLowerCase())){
            throw new IllegalArgumentException("La categoria no es correcta");
        }
        this.categoria=Categoria.valueOf(categoria.toLowerCase());
    }


    @Override
    public String toString() {
        return "El empleado "+nombre+ " con DNI "+dni+ " con perfil "+ categoria+ " progrmaando en "+lenguaje_programacion+ " tiene un salario base de "+SalarioBase+ " que al aplicarle la retencion de "+retencion+ " le supone un salario neto de "+SalarioNeto;
    }
}
