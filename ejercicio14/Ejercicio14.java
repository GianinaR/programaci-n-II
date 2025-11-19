/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;
import static com.mycompany.ejercicio14.Reemplazar.Adicionar;
import static com.mycompany.ejercicio14.Reemplazar.Reemplazar;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author ADRIAN
 */
public class Ejercicio14 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        lista.add("Julio");
        lista.add("Jose");
        lista.add(8);
        lista.add(35);

        ArrayList<Integer>listaNumeros=new ArrayList<Integer>();
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(8);
        ArrayList<String> listaNombres=new ArrayList<String>();
        listaNombres.add("Cristian");
        listaNombres.add("Maria");
        listaNombres.add("Juan");
        listaNombres.add("Pepe");
        listaNombres.add("Victor");
        listaNombres.add("Luis");
        listaNombres.add("Elena");
        System.out.println(listaNombres);
        
        listaNombres.add("Pedro");
        System.out.println(listaNombres);
        
        listaNombres.add(3, "XXXX");
        System.out.println(listaNombres);
        
        String Nombre=listaNombres.get(4);
        System.out.println(Nombre);
        
        listaNombres.set(2, "Juancho");
        System.out.println(listaNombres);
        
        int dimension= listaNombres.size();
        System.out.println(dimension);
        
        boolean resultado =listaNombres.contains("Pepe");
        System.out.println(resultado);
        System.out.println(listaNombres.indexOf("Pepe"));
        
        listaNombres.remove("Juancho");
        listaNombres.remove(1);
        System.out.println("Nueva lista de los nombres\n"+listaNombres);
        
        listaNumeros.add(2,465);
        System.out.println(listaNumeros);
       
        /*for(int x=0;x<listaNombres.size();x++)
        {
            System.out.println("En la posicion : "+x+" posicion esta "+listaNombres.get(x));
        }
        
        Iterator<String>iter=listaNombres.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        
        ArrayList<Integer>listaNum=new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        int numero=0;
        do{
            numero= reader.nextInt();
            listaNum.add(numero);
        }while(numero!=0);
        for(int x=0;x<listaNum.size();x++)
        {
            System.out.println("En la posicion :"+x+" Esta:"+listaNum.get(x));
        }*/
        System.out.println("***************");
        boolean salir=true;
        while(salir){
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleciona una opcion\n"
        +"1.-Adiocionar Elementos a la lista\n"+"2.-Mostrar la lista\n"+"3.-Adicion e intercambio\n"+
                "4.-Modificar\n"+"5.-Eliminar\n"+"6.-Salir\n"));
        
        switch(opcion)
        {
            case 1:
                Adicionar(listaNombres);
                break;
            case 2:
                System.out.println(listaNombres);
                break;
            case 3:
                Reemplazar(listaNombres);
;                break;
            case 4:
                 String pos = JOptionPane.showInputDialog(null, "Introduzca la posición a modificar:");
                    String newValue = JOptionPane.showInputDialog(null, "Introduzca el nuevo nombre:");
                    try {
                        int index = Integer.parseInt(pos);
                        if (index >= 0 && index < listaNombres.size()) {
                            String oldElement = listaNombres.set(index, newValue);
                            JOptionPane.showMessageDialog(null, "Elemento modificado: " + oldElement + " -> " + newValue);
                        } else {
                            JOptionPane.showMessageDialog(null, "Posición fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Introduzca un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            case 5:
                     pos = JOptionPane.showInputDialog( "Introduzca la posición a eliminar:");
                    try {
                        int index = Integer.parseInt(pos);
                        if (index >= 0 && index < listaNombres.size()) {
                            String removedElement = listaNombres.remove(index);
                            JOptionPane.showMessageDialog(null, "Elemento eliminado: " + removedElement);
                        } else {
                            JOptionPane.showMessageDialog(null, "Posición fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Introduzca un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
               
            case 6:
                salir=false;
                break;
        }
    }   
    }
    }
    
