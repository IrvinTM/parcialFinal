/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import logica.Cita;
import logica.Paciente;

/**
 *
 * @author irvin
 */
public class PantallaCita extends javax.swing.JFrame {

        List<Cita> citass = cargarCitasDesdeCSV("citas.csv");

    /**
     * Creates new form PantallaCita
     */
    public PantallaCita() {
        initComponents();
        llenarComboBoxPacientes();
        mostrarCitasEnJTable(citass);
        this.setLocationRelativeTo(null);//centrar el jframe
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        mostrarCitas_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecha_textfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hora_textfield = new javax.swing.JTextField();
        veterinario_textfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        motivo_texfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mascota_comboBox = new javax.swing.JComboBox<>();
        agregar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        mostrarCitas_btn.setText("Actualizar");
        mostrarCitas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCitas_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mostrarCitas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mostrarCitas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(19, Short.MAX_VALUE)));

        jTabbedPane1.addTab("Citas", jPanel1);

        jLabel1.setText("Fecha:");

        jLabel2.setText("Hora:");

        jLabel3.setText("Veterinario:");

        jLabel4.setText("ID Mascota:");

        jLabel5.setText("Motivo:");

        mascota_comboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agregar_btn.setText("Agregar");
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(48, 48, 48)
                                                                .addComponent(fecha_textfield,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 310,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(hora_textfield,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 310,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(veterinario_textfield,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 310,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel2Layout.createSequentialGroup()
                                                                        .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        94,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        94,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(motivo_texfield,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        310, Short.MAX_VALUE)
                                                                                .addComponent(mascota_comboBox, 0,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(269, 269, 269)
                                                .addComponent(agregar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(435, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fecha_textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hora_textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(veterinario_textfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mascota_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(motivo_texfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agregar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(281, Short.MAX_VALUE)));

        jTabbedPane1.addTab("Agregar Citas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap()));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        try {
            String fecha = fecha_textfield.getText();
            String hora = hora_textfield.getText();
            String veterinario = veterinario_textfield.getText();
            // ID de la mascota seleccionada en el JComboBox y imprimir el tipo de dato
            int idMascota = Integer.parseInt(mascota_comboBox.getSelectedItem().toString());
            String motivo = motivo_texfield.getText();
            Cita nuevaCita = new Cita(fecha, hora, veterinario, idMascota, motivo);

            // revisar si algun campo esta vacio
            if (fecha.isEmpty() || hora.isEmpty() || veterinario.isEmpty() || motivo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
                return;
            }
    
            guardarCitaEnCSV(nuevaCita, "citas.csv");
            JOptionPane.showMessageDialog(null, "Cita agregada correctamente");
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Error al agregar cita");
        }

        
    }

    private void mostrarCitas_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Cargar citas desde el archivo CSV

        mostrarCitasEnJTable(citass);




    }

    private void llenarComboBoxPacientes() {
        // Cargar la lista de pacientes desde el archivo "pacientes.csv"
        List<Paciente> pacientes = cargarPacientesDesdeCSV("pacientes.csv");

        // Crear un modelo para el JComboBox
        DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();

        // Llenar el modelo con los IDs de los pacientes convertidos a String
        for (Paciente paciente : pacientes) {
            modeloComboBox.addElement(String.valueOf(paciente.getId()));
        }

        // Establecer el modelo en el JComboBox
        mascota_comboBox.setModel(modeloComboBox);
    }

    private List<Paciente> cargarPacientesDesdeCSV(String nombreArchivo) {
        List<Paciente> pacientes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            boolean primeraLinea = true; // Para omitir la primera línea (encabezados)
            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] campos = linea.split(",");
                int idPaciente = Integer.parseInt(campos[0]);
                String nombre = campos[1];
                int edad = Integer.parseInt(campos[2]);
                double precio = Double.parseDouble(campos[3]);
                double descuento = Double.parseDouble(campos[4]);
                String especie = campos[5];
                String dueno = campos[6];
                String raza = campos[7];

                // Crear el objeto Paciente y agregarlo a la lista
                Paciente paciente = new Paciente(idPaciente, nombre, edad, precio, descuento, especie, dueno, raza);
                pacientes.add(paciente);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return pacientes;
    }

    private Paciente buscarPacientePorId(int id, String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            boolean primeraLinea = true; // Para omitir la primera línea (encabezados)
            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] campos = linea.split(",");
                int idPaciente = Integer.parseInt(campos[0]);

                // Si encontramos al paciente por su ID, creamos y devolvemos un objeto Paciente
                if (idPaciente == id) {
                    String nombre = campos[1];
                    int edad = Integer.parseInt(campos[2]);
                    double precio = Double.parseDouble(campos[3]);
                    double descuento = Double.parseDouble(campos[4]);
                    String especie = campos[5];
                    String dueno = campos[6];
                    String raza = campos[7];

                    return new Paciente(idPaciente, nombre, edad, precio, descuento, especie, dueno, raza);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return null; // Devolver null si no se encuentra el paciente
    }

    // metodo para guardar citas en csv
    // recibe el objeto cita y lo agrega al archivo csv

    private void guardarCitaEnCSV(Cita cita, String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(nombreArchivo, true)))) {
            writer.println(cita.getId() + "," + cita.getFecha() + "," + cita.getHora()
                    + "," + cita.getVeterinario() + "," + cita.getIdMascota() + "," + cita.getMotivo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarYMostrarCitasDesdeCSV(String nombreArchivo) {
        // Cargar citas desde el archivo CSV


        // Mostrar citas en la jTable
        mostrarCitasEnJTable(citass);
    }

    private void mostrarCitasEnJTable(List<Cita> citas) {
        DefaultTableModel tableModel = new DefaultTableModel();

        // Definir las columnas
        String[] columnNames = {"ID", "Fecha", "Hora", "Veterinario", "Mascota ID", "Motivo"};
        tableModel.setColumnIdentifiers(columnNames);

        // Agregar filas al modelo de la tabla
        for (Cita cita : citas) {
            Object[] rowData = {
                cita.getId(),
                cita.getFecha(),
                cita.getHora(),
                cita.getVeterinario(),
                cita.getIdMascota(),
                cita.getMotivo()
            };
            tableModel.addRow(rowData);
        }

        // Establecer el modelo de la tabla
        jTable1.setModel(tableModel);
    }

    // Este método carga las citas desde el archivo CSV y las retorna como una lista
    private List<Cita> cargarCitasDesdeCSV(String nombreArchivo) {
        List<Cita> citas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            // Omitir la primera línea (encabezados)
            reader.readLine();

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                int idCita = Integer.parseInt(campos[0]);
                String fecha = campos[1];
                String hora = campos[2];
                String veterinario = campos[3];
                int idMascota = Integer.parseInt(campos[4]);
                String motivo = campos[5];

                // Crear el objeto Cita y agregarlo a la lista
                Cita cita = new Cita( fecha, hora, veterinario, idMascota, motivo);
                citas.add(cita);
            }

        } catch (IOException | NumberFormatException e) {
            // Manejar las excepciones apropiadamente, por ejemplo, mostrar un mensaje de error al usuario
            e.printStackTrace();
        }

        return citas;
    }


    // Variables declaration - do not modify
    private javax.swing.JButton agregar_btn;
    private javax.swing.JTextField fecha_textfield;
    private javax.swing.JTextField hora_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mascota_comboBox;
    private javax.swing.JButton mostrarCitas_btn;
    private javax.swing.JTextField motivo_texfield;
    private javax.swing.JTextField veterinario_textfield;
    // End of variables declaration
}