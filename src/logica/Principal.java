/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;

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

           /*  Paciente paciente1 = new Paciente("Firu", 5, 2,
             2, "perro", "Chepe", "Comelona");

            Cita cita1 = new Cita("2023-01-01", "10:00", 
            "Dr. López",paciente1 , "Vacunación");
        
            Cita cita2 = new Cita("2023-01-02", "15:30",
         "Dra. García", paciente1, "Chequeo anual");

        // Crear una lista de citas
        List<Cita> listaCitas = new ArrayList<>();
        listaCitas.add(cita1);
        listaCitas.add(cita2);

        // Llamar al método para guardar en CSV
        Cita.guardarCitasEnCSV(listaCitas, "citas.csv");*/

        //Paciente paciente1 = new Paciente("Firulais", 5, 10, 0.5, "Perro", "Juan", "Chihuahua");
       
        //Paciente paciente2 = new Paciente("Lunas", 3, 4.5, 0.4, "Gato", "María", "Siames");

        //List<Paciente> pacientes = new ArrayList<>();
        //pacientes.add(paciente2);
       // pacientes.add(paciente1);

        //for (Paciente paciente : pacientes) {
       //     paciente.guardarPacienteCSV("pacientes.csv");
       //}

        //List<Paciente> pacientesRecuperados = Paciente.recuperarPacientesCSV("pacientes.csv");

//for (Paciente paciente : pacientesRecuperados) {
 //   System.out.println(paciente.toString());

//leer las citas
List<Cita> citas = Cita.cargarCitasDesdeCSV("citas.csv");

        // Imprimir las citas (esto es solo un ejemplo, puedes hacer lo que necesites con las citas)
        for (Cita cita : citas) {
            System.out.println(cita);

}
    }
}

    

