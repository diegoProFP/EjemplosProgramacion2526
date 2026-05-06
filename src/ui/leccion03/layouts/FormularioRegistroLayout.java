package ui.leccion03.layouts;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class FormularioRegistroLayout extends JFrame {

    public FormularioRegistroLayout() {
        setTitle("Leccion 03 - Layouts");
        setSize(520, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Ficha simple del alumno", JLabel.CENTER);
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        add(titulo, BorderLayout.NORTH);

        JPanel panelCentro = new JPanel(new GridLayout(4, 2, 8, 8));
        panelCentro.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        panelCentro.add(new JLabel("Nombre:"));
        panelCentro.add(new JTextField());
        panelCentro.add(new JLabel("Apellidos:"));
        panelCentro.add(new JTextField());
        panelCentro.add(new JLabel("Curso:"));
        panelCentro.add(new JTextField());
        panelCentro.add(new JLabel("Email:"));
        panelCentro.add(new JTextField());
        add(panelCentro, BorderLayout.CENTER);

        JTextArea areaNotas = new JTextArea("Espacio para escribir observaciones...");
        areaNotas.setBorder(BorderFactory.createTitledBorder("Observaciones"));
        add(areaNotas, BorderLayout.EAST);

        JPanel panelBotones = new JPanel();
        panelBotones.add(new JButton("Guardar"));
        panelBotones.add(new JButton("Cancelar"));
        add(panelBotones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioRegistroLayout ventana = new FormularioRegistroLayout();
            ventana.setVisible(true);
        });
    }
}
