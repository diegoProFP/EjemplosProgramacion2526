package colecciones;

import poo.dawbank.movimiento.Utils;
import poo2.superheroes.Superheroe;

import java.util.ArrayList;
import java.util.Collections;

public class EjemplosArrayList {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Sheila");
        nombres.add("Noelia");
        nombres.add("Otman");
        nombres.add("Bea");
        nombres.add("Diego");

        Collections.sort(nombres);

        System.out.println("¿Existe el nombre otman en mi lista? " + nombres.contains("otman"));
        System.out.println("¿cuántos nombres hay?: " + nombres.size());

        System.out.println("Nombre en la posicion 4: " + nombres.get(4));
        System.out.println("En qué posición está Noelia: " + nombres.indexOf("Noelia"));

        nombres.remove(4);
        System.out.println("¿cuántos nombres hay?: " + nombres.size());

        System.out.println("Mostramos todos los nombres: ");

        for (String nombre : nombres){
            System.out.println("El nombre es: " + nombre.toUpperCase());
        }



    }
}
