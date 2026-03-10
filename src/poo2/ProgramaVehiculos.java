package poo2;

public class ProgramaVehiculos {

    public static void main(String[] args) {

        Coche miCoche = new Coche("Seat", "león", 4, 4);

        System.out.println("La marca es: " + miCoche.getMarca());
        System.out.println("El num de puertas es: " + miCoche.getNumPuertas());

        miCoche.imprimirDatos();

        System.out.println("El nº de puertas de mi coche es " + miCoche.getNumPuertas());

        Moto miMoto = new Moto("Honda", "Motus", 2, true);

        System.out.println("AHORA LA MOTO: ");
        miMoto.imprimirDatos();



    }

}
