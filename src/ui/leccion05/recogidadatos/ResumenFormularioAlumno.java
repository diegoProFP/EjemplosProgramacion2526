package ui.leccion05.recogidadatos;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class ResumenFormularioAlumno extends JFrame {

    private final JTextField campoNombre;
    private final JTextField campoEdad;
    private final JComboBox<String> comboModulo;
    private final JCheckBox checkTurnoTarde;
    private final JLabel etiquetaResumen;

    public ResumenFormularioAlumno() {
        setTitle("Leccion 05 - Recogida de datos");
        setSize(520, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        campoNombre = new JTextField();
        campoEdad = new JTextField();
        comboModulo = new JComboBox<>(new String[]{"Programacion", "Bases de Datos", "Entornos"});
        checkTurnoTarde = new JCheckBox("Si");
        etiquetaResumen = new JLabel("Completa el formulario y pulsa el boton");

        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 8, 8));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(15, 15, 10, 15));
        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(campoNombre);
        panelFormulario.add(new JLabel("Edad:"));
        panelFormulario.add(campoEdad);
        panelFormulario.add(new JLabel("Modulo:"));
        panelFormulario.add(comboModulo);
        panelFormulario.add(new JLabel("Turno de tarde:"));
        panelFormulario.add(checkTurnoTarde);

        JButton botonRecogerDatos = new JButton("Recoger datos");
        botonRecogerDatos.addActionListener(e -> mostrarResumen());

        panelFormulario.add(new JLabel());
        panelFormulario.add(botonRecogerDatos);

        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.setBorder(BorderFactory.createEmptyBorder(0, 15, 15, 15));
        panelInferior.add(etiquetaResumen, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(panelFormulario, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }

    private void mostrarResumen() {
        String nombre = campoNombre.getText();
        String edad = campoEdad.getText();
        String modulo = (String) comboModulo.getSelectedItem();
        boolean turnoTarde = checkTurnoTarde.isSelected();

        String resumen = "Alumno: " + nombre
                + " | Edad: " + edad
                + " | Modulo: " + modulo
                + " | Turno de tarde: " + (turnoTarde ? "Si" : "No");

        etiquetaResumen.setText(resumen);
        JOptionPane.showMessageDialog(this, resumen, "Datos recogidos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ResumenFormularioAlumno ventana = new ResumenFormularioAlumno();
            ventana.setVisible(true);
        });
    }
}
