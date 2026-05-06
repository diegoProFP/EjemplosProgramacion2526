package ui.leccion02.componentes;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class VentanaComponentesBasicos extends JFrame {

    public VentanaComponentesBasicos() {
        setTitle("Leccion 02 - Componentes basicos");
        setSize(450, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new GridLayout(5, 2, 8, 8));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel etiquetaNombre = new JLabel("Nombre:");
        JTextField campoNombre = new JTextField();

        JLabel etiquetaModulo = new JLabel("Modulo:");
        String[] modulos = {"Programacion", "Bases de Datos", "Entornos"};
        JComboBox<String> comboModulos = new JComboBox<>(modulos);

        JLabel etiquetaTurno = new JLabel("Turno de tarde:");
        JCheckBox checkTurno = new JCheckBox();

        JLabel etiquetaBoton = new JLabel("Accion:");
        JButton botonEnviar = new JButton("Enviar");

        panelPrincipal.add(etiquetaNombre);
        panelPrincipal.add(campoNombre);
        panelPrincipal.add(etiquetaModulo);
        panelPrincipal.add(comboModulos);
        panelPrincipal.add(etiquetaTurno);
        panelPrincipal.add(checkTurno);
        panelPrincipal.add(etiquetaBoton);
        panelPrincipal.add(botonEnviar);
        panelPrincipal.add(new JLabel("Observacion:"));
        panelPrincipal.add(new JLabel("Todavia no hay eventos"));

        add(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaComponentesBasicos ventana = new VentanaComponentesBasicos();
            ventana.setVisible(true);
        });
    }
}
