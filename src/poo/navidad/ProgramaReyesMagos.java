package poo.navidad;

public class ProgramaReyesMagos {

    public static void main(String[] args) {

        System.out.println(Colores.RED);

        //Creamos los "reyes magos" -> es decir, creamos los objetos
        ReyMago melchor = new ReyMago("Melchor", true, "Roja");
        melchor.setRegalo("Oro");

        ReyMago gaspar = new ReyMago("Gaspar", false, "Azul");
        gaspar.setRegalo("Incienso");

        ReyMago baltasar = new ReyMago("Baltasar", false, "Verde");
        baltasar.setRegalo("Mirra");

        melchor.presentarse();
        gaspar.presentarse();
        baltasar.presentarse();






    }
}
