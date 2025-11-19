/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio14;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author ADRIAN
 */
public class Reemplazar {
     public static void Reemplazar(ArrayList<String> listaNombres) {
         int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion"));
        String nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre:");
        if (nombre != null && !nombre.trim().isEmpty()) {
            listaNombres.add(posicion,nombre);
            JOptionPane.showMessageDialog(null, "Nombre agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no válido.");
        }
    }
    public static void Adicionar(ArrayList<String> listaNombres) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre:");
        if (nombre != null && !nombre.trim().isEmpty()) {
            listaNombres.add(nombre);
            JOptionPane.showMessageDialog(null, "Nombre agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no válido.");
        }
    }
    
}
    


