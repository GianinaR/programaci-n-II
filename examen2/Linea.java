package examen2;

public class Linea {
    private String color;
    private Persona[] filaPersonas;
    private Cabina[] cabinas;
    private int cantidadCabinas;

    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new Persona[10];
        this.cabinas = new Cabina[20];
        this.cantidadCabinas = 0;
    }

    public String getColor(){
        return color;
    }

    public void agregarPersona(Persona p) {
        for(int i = 0; i < filaPersonas.length; i++){
            if(filaPersonas[i] == null){
                filaPersonas[i] = p;
                System.out.println("Person " + color);
                return;
            }
        }
    }

    public void agregarCabina(Cabina c) {
        for(int i = 0; i < cabinas.length; i++){
            if(cabinas[i] == null){
                cabinas[i] = c;
                cantidadCabinas++;
                return;
            }
        }
    }
}
