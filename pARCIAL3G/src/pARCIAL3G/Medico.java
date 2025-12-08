package pARCIAL3G;

public class Medico {

    int idMed;
    String nombre;
    String apellido;
    int experiencia;

    public Medico(int idMed, String nombre, String apellido, int experiencia) {
        this.idMed = idMed;
        this.nombre = nombre;
        this.apellido = apellido;
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return idMed + " - " + nombre + " " + apellido + " (" + experiencia + " años)";
    }
}