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

}

