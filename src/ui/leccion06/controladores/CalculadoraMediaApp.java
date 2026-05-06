package ui.leccion06.controladores;

import javax.swing.SwingUtilities;

public class CalculadoraMediaApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraMediaView vista = new CalculadoraMediaView();
            new CalculadoraMediaController(vista);
            vista.setVisible(true);
        });
    }
}
