package colecciones;

import java.util.*;

public class EjemploOrdenacion {

    public static void main(String[] args) {

        List<String> letras = new ArrayList<>();
        letras.add("D");
        letras.add("F");
        letras.add("B");
        letras.add("A");

        //Ordenamos la lista
        Collections.sort(letras);

        for (String letra: letras){
            System.out.println(letra);
        }

        List<Integer> numeros = Arrays.asList(5,7,9, 12, 2, 66);

        //Ordenamos la lista de forma INVERSA
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);
    }
}
