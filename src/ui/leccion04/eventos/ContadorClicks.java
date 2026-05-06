package ui.leccion04.eventos;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class ContadorClicks extends JFrame {

    private int contador;
    private final JLabel etiquetaContador;

    public ContadorClicks() {
        setTitle("Leccion 04 - Eventos");
        setSize(420, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        etiquetaContador = new JLabel("Numero de clics: 0", JLabel.CENTER);
        etiquetaContador.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton botonSumar = new JButton("Haz clic aqui");
        botonSumar.addActionListener(e -> incrementarContador());

        JButton botonReiniciar = new JButton("Reiniciar");
        botonReiniciar.addActionListener(e -> reiniciarContador());

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonSumar);
        panelBotones.add(botonReiniciar);

        setLayout(new BorderLayout());
        add(etiquetaContador, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void incrementarContador() {
        contador++;
        etiquetaContador.setText("Numero de clics: " + contador);
    }

    private void reiniciarContador() {
        contador = 0;
        etiquetaContador.setText("Numero de clics: 0");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContadorClicks ventana = new ContadorClicks();
            ventana.setVisible(true);
        });
    }
}
