package strings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase y te digo el nº de vocales");
        String frase = teclado.nextLine();
        int contAs = 0, contEs= 0, contIs= 0,contOs = 0, contUs = 0;

        String fraseMays = frase.toUpperCase();
        //Reemplazo las tildes por las letras "normales"
        fraseMays = fraseMays.replace('Á', 'A');
        fraseMays = fraseMays.replace('É', 'E');
        fraseMays = fraseMays.replace('Í', 'I');
        fraseMays = fraseMays.replace('Ó', 'O');
        fraseMays = fraseMays.replace('Ú', 'U');
        System.out.println("fraseMays = " + fraseMays);
        for (int cont = 0; cont < fraseMays.length(); cont++) {
            char letra = fraseMays.charAt(cont);
            switch (letra){
                case 'A' -> contAs++;
                case 'E' -> contEs++;
                case 'I' -> contIs++;
                case 'O' -> contOs++;
                case 'U' -> contUs++;
            }
        }

        System.out.println("Nº de A's: " + contAs);
        System.out.println("Nº de E's: " + contEs);
        System.out.println("Nº de I's: " + contIs);
        System.out.println("Nº de O's: " + contOs);
        System.out.println("Nº de U's: " + contUs);





    }
}
