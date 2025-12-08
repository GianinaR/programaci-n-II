package pARCIAL3G;

public class Consultorio {
	  
    String consultas;   // listado de consultas (texto)
    String medicos;     // listado de médicos (texto)

    public Consultorio(String consultas, String medicos) {
        this.consultas = consultas;
        this.medicos = medicos;
    }

    public String getConsultas() {
        return consultas;
    }

    public String getMedicos() {
        return medicos;
    }

    public void setConsultas(String consultas) {
        this.consultas = consultas;
    }

    public void setMedicos(String medicos) {
        this.medicos = medicos;
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "consultas='" + consultas + '\'' +
                ", medicos='" + medicos + '\'' +
                '}';
    }
}