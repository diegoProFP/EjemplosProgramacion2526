package ui.leccion01.ventana;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class VentanaHolaMundo extends JFrame {

    public VentanaHolaMundo() {
        setTitle("Leccion 01 - Mi primera ventana");
        setSize(420, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel etiqueta = new JLabel("Hola Swing", SwingConstants.CENTER);
        add(etiqueta);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaHolaMundo ventana = new VentanaHolaMundo();
            ventana.setVisible(true);
        });
    }
}
