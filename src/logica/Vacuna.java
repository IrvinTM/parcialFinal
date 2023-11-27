/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author irvin
 */
    public class Vacuna {
    private String fechaVacuna;
    private String nombreVacuna;
    private int idPaciente;

    // Constructor para inicializar los atributos
    public Vacuna(String fechaVacuna, String nombreVacuna, int idPaciente) {
        this.fechaVacuna = fechaVacuna;
        this.nombreVacuna = nombreVacuna;
        this.idPaciente = idPaciente;
    }

    // Métodos para obtener y establecer información
    public String getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(String fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public int getidPaciente() {
        return idPaciente;
    }

    public void setidPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
}
