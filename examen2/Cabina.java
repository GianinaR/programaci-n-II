package examen2;

public class Cabina {
    private int nroCabinas;
    private Persona[] personasAbordo;

    public Cabina(int nroCabinas) {
        this.nroCabinas = nroCabinas;
        this.personasAbordo = new Persona[nroCabinas];
    }

    public void agregarPersona(Persona p) {
        for (int i = 0; i < personasAbordo.length; i++) {
            if (personasAbordo[i] == null) {
                personasAbordo[i] = p;
                System.out.println("Subiendo ");
                return;
            }
        }
        System.out.println("Cabina llena");
    }
}
