    /*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    */
    package logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

    public class Cita {
        private static final AtomicInteger contadorId = new AtomicInteger(0);
        private int id;
        private String fecha;
        private String hora;
        private String veterinario;
        private Paciente mascota;
        private String motivo;

        public Cita(String fecha, String hora, String veterinario, Paciente mascota, String motivo) {
            this.id = contadorId.incrementAndGet();
            this.fecha = fecha;
            this.hora = hora;
            this.veterinario = veterinario;
            this.mascota = mascota;
            this.motivo = motivo;
        }

        // Getters y setters para todos los atributos

        public int getId() {
            return id;
        }

        public String getFecha() {
            return fecha;
        }

        public String getHora() {
            return hora;
        }

        public String getVeterinario() {
            return veterinario;
        }

        public Paciente getMascota() {
            return mascota;
        }

        public String getMotivo() {
            return motivo;
        }

        public void setMotivo(String motivo) {
            this.motivo = motivo;
        }

        @Override
        public String toString() {
            return "Cita [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", veterinario=" + veterinario + ", mascota="
                    + mascota + ", motivo=" + motivo + "]";
        }

        public static void guardarCitasEnCSV(List<Cita> citas, String rutaArchivo) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Escribir encabezados
            writer.write("ID,Fecha,Hora,Veterinario,Mascota,Motivo\n");

            // Escribir datos de citas
            for (Cita cita : citas) {
                writer.write(String.format("%d,%s,%s,%s,%s,%s\n",
                        cita.getId(),
                        cita.getFecha(),
                        cita.getHora(),
                        cita.getVeterinario(),
                        cita.getMascota().toString(),
                        cita.getMotivo()));
            }

            System.out.println("Datos guardados en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static List<Cita> cargarCitasDesdeCSV(String rutaArchivo) {
        List<Cita> citas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Leer la primera línea (encabezados) y descartarla
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String fecha = datos[1];
                String hora = datos[2];
                String veterinario = datos[3];

                // Parsear los datos del objeto Paciente
                String datosMascota = datos[4].substring("Mascota{id=".length()); // Eliminar "Mascota{id=" del principio
int indexOfComma = datosMascota.indexOf(",");
int idMascota = Integer.parseInt(datosMascota.substring(0, indexOfComma));
String nombreMascota = datosMascota.substring(indexOfComma + 1, datosMascota.indexOf("'", indexOfComma + 1));
                
                int edadMascota = Integer.parseInt(datos[6]);
                double pesoMascota = Double.parseDouble(datos[7]);
                double alturaMascota = Double.parseDouble(datos[8]);
                String tipoMascota = datos[9];
                String nombreDueno = datos[10];
                String razaMascota = datos[11];

                // Crear el objeto Paciente con todos los atributos
                Paciente mascota = new Paciente( nombreMascota, edadMascota, pesoMascota, alturaMascota, tipoMascota, nombreDueno, razaMascota);

                String motivo = datos[12];

                // Crear la cita y agregarla a la lista
                Cita cita = new Cita(fecha, hora, veterinario, mascota, motivo);
                citas.add(cita);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return citas;
    }

}

