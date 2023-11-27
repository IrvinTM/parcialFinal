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
        private String motivo;
        private int idMascota;


        public Cita(String fecha, String hora, String veterinario, int idMascota, String motivo) {
            this.id = contadorId.incrementAndGet();
            this.fecha = fecha;
            this.hora = hora;
            this.veterinario = veterinario;
            this.idMascota = idMascota;
            this.motivo = motivo;
        }

        

        // Getters y setters para todos los atributos

        public int getIdMascota() {
            return idMascota;
        }

        public void setIdMascota(int idMascota) {
            this.idMascota = idMascota;
        }

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


        public String getMotivo() {
            return motivo;
        }

        public void setMotivo(String motivo) {
            this.motivo = motivo;
        }

        @Override
        public String toString() {
            return "Cita{" + "id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", veterinario=" + veterinario + ", motivo=" + motivo + ", idMascota=" + idMascota + '}';
        }


        
    

}

