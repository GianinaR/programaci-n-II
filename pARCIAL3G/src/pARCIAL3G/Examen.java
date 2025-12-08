package pARCIAL3G;


import java.util.ArrayList;

/**
 * @author AREA PROGRAMACION
 */
public class Examen {
    public static void main(String[] args) {
        
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();
        System.out.println("a)");
        // a) DAR DE ALTA 3 MÉDICOS Y 9 CONSULTAS
       
        medicos.add(new Medico(1, "Carlos", "Méndez", 10));
        medicos.add(new Medico(2, "Ana", "Rojas", 5));
        medicos.add(new Medico(3, "Luis", "Fernández", 20));

        consultas.add(new Consulta(123, "Juan", "Pérez", 1, "10/11/2023"));
        consultas.add(new Consulta(124, "Lucía", "Flores", 2, "12/11/2023"));
        consultas.add(new Consulta(125, "Marcos", "Díaz", 3, "25/12/2023"));
        consultas.add(new Consulta(126, "Pedro", "Rojas", 1, "01/01/2024"));
        consultas.add(new Consulta(127, "Felipe", "Lima", 2, "20/11/2023"));
        consultas.add(new Consulta(128, "Sara", "Guzmán", 3, "05/01/2024"));
        consultas.add(new Consulta(129, "Claudia", "Torrez", 3, "02/02/2024"));
        consultas.add(new Consulta(130, "Mario", "Suárez", 1, "11/11/2023"));
        consultas.add(new Consulta(131, "Gabriela", "Vera", 2, "24/12/2023"));

        // b) DAR DE BAJA UN MÉDICO POR NOMBRE + APELLIDO
        System.out.println("b)");
        String borrarNombre = "Ana";
        String borrarApellido = "Rojas";

        Medico aBorrar = null;
        for (Medico m : medicos) {
            if (m.nombre.equals(borrarNombre) && m.apellido.equals(borrarApellido)) {
                aBorrar = m;
                break;
            }
        }
        
        if (aBorrar != null) {
            medicos.remove(aBorrar);

            // eliminar consultas asociadas
            java.util.Iterator<Consulta> it = consultas.iterator();
            while (it.hasNext()) {
                Consulta c = it.next();
                if (c.idMed == aBorrar.idMed) {
                    it.remove();
                }
            }

            System.out.println("Médico eliminado: " + borrarNombre + " " + borrarApellido);
        }
        System.out.println("c)");
        // c) CAMBIAR CONSULTAS DE NAVIDAD Y AÑO NUEVO
        for (Consulta c : consultas) {
            if (c.fecha.equals("25/12/2023")) {
                c.fecha = "26/12/2023";
            }
            if (c.fecha.equals("01/01/2024")) {
                c.fecha = "02/01/2024";
            }
        }

        // IMPRIMIR RESULTADOS FINALES
        System.out.println("\n--- MÉDICOS ---");
        for (Medico m : medicos) {
            System.out.println(m);
        }

        System.out.println("\n--- CONSULTAS ---");
        for (Consulta con : consultas) {
            System.out.println(con);
        }
    }
}