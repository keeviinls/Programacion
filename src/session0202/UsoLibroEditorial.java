package session0202;

public class UsoLibroEditorial {
    public static void main(String[] args) {
        Libro libro1=new Libro();
        Editorial editorial1=new Editorial();
        System.out.println("El libro tiene un isbn de" +libro1.getIsbn());
        System.out.println("El titulo del libro es " +libro1.getTitulo());
        System.out.println("El año de publicacion del libro es " +libro1.getAnio());
        System.out.println("El libro tiene un precio de "+libro1.getPrecio());
        System.out.println("El codigo es "+editorial1.getCodigo());
        System.out.println("El nombre es "+editorial1.getNombre());
        System.out.println("El año de publicacion es "+editorial1.getAño());
        System.out.println("====================================================================");
        System.out.println("====================================================================");


        Editorial editorial2=new Editorial(123133131, "MOnunsta", 1999);
        Libro libro2=new Libro("12831319B", "El niño de pijama de rayas", 123, 23, editorial2);
        System.out.println("El libro tiene un isbn de " +libro2.getIsbn());
        System.out.println("El titulo del libro es " +libro2.getTitulo());
        System.out.println("El año de publicacion del libro es " +libro2.getAnio());
        System.out.println("El libro tiene un precio de "+libro2.getPrecio());
        System.out.println("El codigo es "+editorial2.getCodigo());
        System.out.println("El nombre es "+editorial2.getNombre());
        System.out.println("El año de publicacion es "+editorial2.getAño());
    }
}
