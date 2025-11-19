package examen2;

public class MiTeleferico {
    private Linea[] lineas;
    private float cantidadIngresos;

    public MiTeleferico() {
        this.lineas = new Linea[10];
        this.cantidadIngresos = 0;
    }

    public void agregarLinea(String color) {
        for(int i = 0; i < lineas.length; i++){
            if(lineas[i] == null){
                lineas[i] = new Linea(color);
                return;
            }
        }
    }

    public void agregarPersona(Persona p, String colorLinea, float tarifa) {
        for(int i = 0; i < lineas.length; i++){
            if(lineas[i] != null && lineas[i].getColor().equalsIgnoreCase(colorLinea)){
                lineas[i].agregarPersona(p);
                cantidadIngresos += tarifa;
                return;
            }
        }
    }

    public float calcularIngresos() {
        return cantidadIngresos;
    }
}

