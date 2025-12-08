package pARCIAL3G;



public class Consulta {
    int ci;
    String nombrePaciente;
    String apellidoPaciente;
    int idMed;
    String fecha;

    public Consulta(int ci, String nombre, String apellido, int idMed, String fecha) {
        this.ci = ci;
        this.nombrePaciente = nombre;
        this.apellidoPaciente = apellido;
        this.idMed = idMed;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return ci + " - " + nombrePaciente + " " + apellidoPaciente + " | Med: " + idMed + " | Fecha: " + fecha;
    }
}