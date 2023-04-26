package session2404;

public class Main {
    public static void main(String[] args) {

        Mujer m1 = new Mujer("12345678X", "Sofia", "Bermejo", 38, 1.60, 100, false);
        Mujer m2 = new Mujer("12348888X", "Alba", "Benjumea", 20, 1.60, 60, true);

        Hombre h1 = new Hombre("12345678K", "Mark", "Anthony", 19, 1.77, 80, false);
        Hombre h2 = new Hombre("12348888K", "Kevin", "Loayza", 21, 1.75, 76, true);

        Filtrados.add(m1);
        Filtrados.add(m2);
        Filtrados.add(h1);
        Filtrados.add(h2);
        System.out.println("Imprimir las peronas insertadas en lista");
        Filtrados.printArray(Filtrados.lista);
        System.out.println("Imprimir de mayor a menor icm");
        Filtrados.OrderByHigherToLowerIMC();
        System.out.println("Imprimir de menor a mayor icm");
        Filtrados.OrderByHigherToLowerIMC();

        System.out.println("Filtrar los chicos con icm menor a 25");
        Filtrados.printArray(Filtrados.filterbyGenderICMLower(25,'H'));





    }
}
