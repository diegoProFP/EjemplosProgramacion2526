package poo;

import java.util.Scanner;

public class ProgramaCoches {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime qué marca le ponemos:");
        String marcaDelCoche = teclado.nextLine();

        Coche deMiPadre = new Coche(marcaDelCoche, "Supra", "diesel", 5);

        deMiPadre.conducir();
        deMiPadre.imprimirCoche();

        if(deMiPadre.getMarca().equalsIgnoreCase("Tesla")){
            System.out.println("Mi padre mola");
        }else{
            System.out.println("Mi padre mola pero no tanto");
        }

        if(deMiPadre.getNumPuertas() >= 3){
            System.out.println("Es un coche normal...");
        }else{
            System.out.println("Parece una moto...");
        }


        /*


        Coche miPrimerCoche = new Coche("Peugeot", "206", "Gasolina", 3);

        miPrimerCoche.setMarca("Peugeot");
        miPrimerCoche.setModelo("206");

        System.out.println(miPrimerCoche.getMarca());

        miPrimerCoche.imprimirCoche();


        Coche miUltimoCoche = new Coche("Seat", "León", "Diesel", 5);

        miUltimoCoche.setMarca("Seat");
        miUltimoCoche.setModelo("León PLUS");

        miUltimoCoche.imprimirCoche();

        miPrimerCoche.conducir();
        miPrimerCoche.conducir();
        miPrimerCoche.conducir();
        miPrimerCoche.conducir();

        miUltimoCoche.conducir();

        System.out.println("Combustible restante Mi primer coche = " + miPrimerCoche.getCombustibleRestante());
        System.out.println("KM recorridos Mi primer coche = " + miPrimerCoche.getKmRecorridos());
        System.out.println();

        System.out.println("Combustible restante Mi ULTIMO coche = " + miUltimoCoche.getCombustibleRestante());
        System.out.println("KM recorridos Mi ULTIMO  coche = " + miUltimoCoche.getKmRecorridos());
*/
    }
}
