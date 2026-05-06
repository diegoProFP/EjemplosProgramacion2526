package ui.leccion06.controladores;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class CalculadoraMediaView extends JFrame {

    private final JTextField campoNota1;
    private final JTextField campoNota2;
    private final JTextField campoNota3;
    private final JLabel etiquetaResultado;
    private final JButton botonCalcular;

    public CalculadoraMediaView() {
        setTitle("Leccion 05 - Controlador de eventos");
        setSize(420, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new GridLayout(5, 2, 8, 8));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        campoNota1 = new JTextField();
        campoNota2 = new JTextField();
        campoNota3 = new JTextField();
        etiquetaResultado = new JLabel("Introduce tres notas");
        botonCalcular = new JButton("Calcular media");

        panelPrincipal.add(new JLabel("Nota 1:"));
        panelPrincipal.add(campoNota1);
        panelPrincipal.add(new JLabel("Nota 2:"));
        panelPrincipal.add(campoNota2);
        panelPrincipal.add(new JLabel("Nota 3:"));
        panelPrincipal.add(campoNota3);
        panelPrincipal.add(new JLabel("Resultado:"));
        panelPrincipal.add(etiquetaResultado);
        panelPrincipal.add(new JLabel());
        panelPrincipal.add(botonCalcular);

        add(panelPrincipal);
    }

    public void mostrar() {
        SwingUtilities.invokeLater(() -> setVisible(true));
    }

    public JButton getBotonCalcular() {
        return botonCalcular;
    }

    public String getTextoNota1() {
        return campoNota1.getText();
    }

    public String getTextoNota2() {
        return campoNota2.getText();
    }

    public String getTextoNota3() {
        return campoNota3.getText();
    }

    public void setResultado(String texto) {
        etiquetaResultado.setText(texto);
    }
}
