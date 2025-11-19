package examen2;

public class Main {
    public static void main(String[] args) {

        MiTeleferico teleferico = new MiTeleferico();

        teleferico.agregarLinea("Roja");
        teleferico.agregarLinea("Amarilla");
        teleferico.agregarLinea("Verde");

        Persona p1 = new Persona("Juan", 25, 70);
        Persona p2 = new Persona("Maria", 65, 60);
        Persona p3 = new Persona("Luis", 10, 35);
        Persona p4 = new Persona("Ana", 30, 55);


        teleferico.agregarPersona(p1, "Ro>ja", 3f);
        teleferico.agregarPersona(p2, "Roja", 1.5f);
        teleferico.agregarPersona(p3, "Amarilla", 1.5f);
        teleferico.agregarPersona(p4, "Verde", 3f);

        System.out.println("\n---------------------------------");
        System.out.println("INGRESOS TOTAL DEL SISTEMA: " + teleferico.calcularIngresos() + " Bs");
        System.out.println("---------------------------------");
    }
}
