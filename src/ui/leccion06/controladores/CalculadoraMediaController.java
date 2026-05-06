package ui.leccion06.controladores;

public class CalculadoraMediaController {

    private final CalculadoraMediaView vista;

    public CalculadoraMediaController(CalculadoraMediaView vista) {
        this.vista = vista;
        this.vista.getBotonCalcular().addActionListener(e -> calcularMedia());
    }

    private void calcularMedia() {
        try {
            double nota1 = Double.parseDouble(vista.getTextoNota1());
            double nota2 = Double.parseDouble(vista.getTextoNota2());
            double nota3 = Double.parseDouble(vista.getTextoNota3());

            double media = (nota1 + nota2 + nota3) / 3;
            vista.setResultado(String.format("Media: %.2f", media));
        } catch (NumberFormatException e) {
            vista.setResultado("Error: revisa las notas");
        }
    }
}
