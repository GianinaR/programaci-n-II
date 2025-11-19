package examen2;

public class Persona {
    private String nombre;
    private String edad;
    private float pesoPersona;

    public Persona(String nombre, String edad, float pesoPersona) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = pesoPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", pesoPersona=" + pesoPersona +
                '}';
    }
}
