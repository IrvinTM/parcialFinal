/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import interfaz.PantallaPrincipal;

/**
 *
 * @author Test
 */
public class Principal {

    
    
    public static void main(String[] args) {

        //nuevo objeto paciente Paciente(String nombre, int edad, double peso, double altura,
     //String tipoMascota, String nombreDueno, String raza)

     // call the principal from package interfaz

         PantallaPrincipal principal = new PantallaPrincipal();
            principal.setVisible(true);

        Paciente paciente1 = new Paciente("Firulais", 5, 10, 0.5, "Perro", "Juan", "Chihuahua");
       System.out.println(paciente1.toString());
       
         
       
    }
    
}
