package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Paciente {
    private static final AtomicInteger contadorId = new AtomicInteger(0);
    private int id;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private String tipoMascota;
    private String nombreDueno;
    private String raza;

    public Paciente(String nombre, int edad, double peso, double altura,
     String tipoMascota, String nombreDueno, String raza) {
        this.id = contadorId.incrementAndGet(); // Generar un ID único
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipoMascota = tipoMascota;
        this.nombreDueno = nombreDueno;
        this.raza = raza;
    }

    // Getters y setters para todos los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", tipoMascota='" + tipoMascota + '\'' +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    public void guardarPacienteCSV(String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%s,%s,%d,%.2f,%.2f,%s,%s,%s\n",
                    Integer.toString(id), nombre, edad, peso, altura, tipoMascota, nombreDueno, raza));
    
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Paciente> recuperarPacientesCSV(String archivo) {
        List<Paciente> pacientes = new ArrayList<>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean primeraLinea = true;
    
            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    // Ignorar la primera línea que contiene los encabezados
                    primeraLinea = false;
                    continue;
                }
    
                String[] campos = linea.split(",");
    
                if (campos.length == 8) {
                    Paciente paciente = new Paciente(campos[1].trim(), Integer.parseInt(campos[2].trim()),
                            Double.parseDouble(campos[3].trim()), Double.parseDouble(campos[4].trim()),
                            campos[5].trim(), campos[6].trim(), campos[7].trim());
    
                    paciente.setId(Integer.parseInt(campos[0].trim()));
    
                    pacientes.add(paciente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return pacientes;
    }

}

