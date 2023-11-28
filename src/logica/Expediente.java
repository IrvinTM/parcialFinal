
package logica;

import java.util.List;


public class Expediente {
    // Atributos existentes

    private Paciente paciente;
    private List<Cita> citas;
    private List<Vacuna> vacunas;
    

    public Expediente(Paciente paciente, List<Cita> citas, List<Vacuna> vacunas) {
        // Inicializar atributos existentes
        // ...

        this.citas = citas;
        this.vacunas = vacunas;
        this.paciente = paciente;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(List<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String mostrarExpediente() {
        StringBuilder expedienteInfo = new StringBuilder();

        expedienteInfo.append("Información del Expediente:\n");
        expedienteInfo.append("Paciente: ").append(paciente.getNombre()).append("\n");
        expedienteInfo.append("Edad: ").append(paciente.getEdad()).append("\n");
        expedienteInfo.append("Especie: ").append(paciente.getRaza()).append("\n");
        expedienteInfo.append("Dueño: ").append(paciente.getNombreDueno()).append("\n");
        expedienteInfo.append("Raza: ").append(paciente.getRaza()).append("\n\n");

        expedienteInfo.append("Citas:\n");
        for (Cita cita : citas) {
            expedienteInfo.append("ID de Cita: ").append(cita.getId()).append("\n");
            expedienteInfo.append("Fecha y Hora: ").append(cita.getFecha()).append(", ").append(cita.getHora()).append("\n");
            expedienteInfo.append("Veterinario: ").append(cita.getVeterinario()).append("\n");
            expedienteInfo.append("Motivo: ").append(cita.getMotivo()).append("\n\n");
        }

        expedienteInfo.append("Vacunas:\n");
        for (Vacuna vacuna : vacunas) {
            expedienteInfo.append("Fecha de Vacuna: ").append(vacuna.getFechaVacuna()).append("\n");
            expedienteInfo.append("Nombre de Vacuna: ").append(vacuna.getNombreVacuna()).append("\n");
            expedienteInfo.append("ID de Paciente: ").append(vacuna.getidPaciente()).append("\n\n");
        }

        return expedienteInfo.toString();
    }
}

