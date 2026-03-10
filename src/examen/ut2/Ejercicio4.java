package examen.ut2;

import java.util.Arrays;
import java.util.Scanner;

/**
 Realiza un programa que gestione un pequeño catálogo de videojuegos.
 1. Primero, el programa solicitará al usuario un número N, que será la cantidad de videojuegos a
 registrar.
 2. A continuación, se deberán introducir N títulos de videojuegos, uno por línea.
 Una vez recogidos y almacenados todos los títulos,
 el programa mostrará un menú de opciones.
 El usuario deberá introducir el número de la opción que quiera ejecutar sobre la lista de juegos previamente cargada.
 Se podrá seleccionar opciones sobre los juegos introducidos hasta que se seleccione la opción de SALIR.
 El menú será el siguiente:
 1. TÍTULO MÁS LARGO
 2. MOSTRAR INICIALES
 3. COMPARAR TÍTULOS
 4. SALIR
 Las opciones funcionan de la siguiente manera:
 1. TÍTULO MÁS LARGO
 o Encuentra y muestra el título más largo del catálogo.
 o Si hubiera varios con la misma longitud máxima, se mostrará el primero que aparezca.
 2. MOSTRAR INICIALES
 o Pedirá al usuario un número de videojuego (de 1 a N) y mostrará las iniciales de dicho
 juego. Deberá mostrar el título original y luego sus siglas en mayúsculas. Por ejemplo:
 • The Legend of Zelda -> TLOZ
 3. COMPARAR TÍTULOS
 o Pedirá al usuario dos números enteros entre 1 y N (siendo N el número de títulos
 registrados). Esos números representan posiciones dentro del catálogo.
 o El programa deberá decir si los títulos almacenados en esas dos posiciones son iguales o
 distintos, mostrando un mensaje con el resultado. Se considera igual si coinciden
 independientemente de las mayúsculas o minúsculas. Ejemplo de ejecución:
 DIGA PRIMER NÚMERO
 3
 DIGA SEGUNDO NÚMERO
 6
 SON IGUALES
 o
 4. SALIR
 o Termina la ejecución del programa.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos videojuegos desea registrar? ");
        int totalJuegos = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer

        String[] catalogo = new String[totalJuegos];

        // Recoger títulos de videojuegos
        for (int numJuego = 0; numJuego < totalJuegos; numJuego++) {
            System.out.print("Introduce el título del videojuego " + (numJuego + 1) + ": ");
            catalogo[numJuego] = teclado.nextLine();
        }

        int opcion;
        do {
            // Mostrar menú
            System.out.println("\nMENÚ DE OPCIONES:");
            System.out.println("1. TÍTULO MÁS LARGO");
            System.out.println("2. MOSTRAR INICIALES");
            System.out.println("3. COMPARAR TÍTULOS");
            System.out.println("4. SALIR");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // TÍTULO MÁS LARGO
                    String tituloMasLargo = "";
                    for (int numJuego = 0; numJuego < totalJuegos; numJuego++) {
                        String titulo = catalogo[numJuego];
                        if (titulo.length() > tituloMasLargo.length()) {
                            tituloMasLargo = titulo;
                        }
                    }

                    System.out.println("El título más largo es: " + tituloMasLargo);
                    break;

                case 2:
                    // MOSTRAR INICIALES
                    System.out.print("Introduce el número del videojuego (1-" + totalJuegos + "): ");
                    int numJuego = teclado.nextInt();
                    teclado.nextLine(); // Limpiar buffer
                    if (numJuego >= 1 && numJuego <= totalJuegos) {
                        String titulo = catalogo[numJuego - 1];

                        cogerInicialesV2(titulo);
                        //cogerInicialesV1(titulo);


                    } else {
                        System.out.println("Número de videojuego inválido.");
                    }
                    break;

                case 3:
                    // COMPARAR TÍTULOS
                    System.out.print("DIGA PRIMER NÚMERO: ");
                    int primerNum = teclado.nextInt();
                    System.out.print("DIGA SEGUNDO NÚMERO: ");
                    int segundoNum = teclado.nextInt();
                    teclado.nextLine(); // Limpiar buffer
                    if (primerNum >= 1 && primerNum <= totalJuegos
                            && segundoNum >= 1 && segundoNum <= totalJuegos) {
                        String titulo1 = catalogo[primerNum - 1];
                        String titulo2 = catalogo[segundoNum - 1];
                        if (titulo1.equalsIgnoreCase(titulo2)) {
                            System.out.println("SON IGUALES");
                        } else {
                            System.out.println("SON DISTINTOS");
                        }
                    } else {
                        System.out.println("Números de videojuego inválidos.");
                    }
                    break;
                case 4:
                    // SALIR
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
                    break;
                    }
        } while (opcion != 4);
        teclado.close();

    }

    /**
     * Opción más simple
     * @param titulo
     */
    private static void cogerInicialesV2(String titulo) {

        String iniciales = "";
        iniciales += Character.toUpperCase(titulo.charAt(0));
        for (int cont = 1; cont < titulo.length(); cont++) {
            if(titulo.charAt(cont) == ' '){
                iniciales += Character.toUpperCase(titulo.charAt(cont+1));
            }
        }
        System.out.println("Título: " + titulo);
        System.out.println("Iniciales: " + iniciales);
    }

    /**
     * Opción más larga pero más parecida a la que hemos visto en clase
     * @param titulo
     */
    private static void cogerInicialesV1(String titulo) {
        //Separamos en palabras el titulo
        String iniciales = "";
        //contamos primero cuántas palabras hay
        int numPalabras = 0;
        for (int cont = 0; cont < titulo.length(); cont++) {
            if(titulo.charAt(cont) == ' '){
                numPalabras++;
            }
        }
        numPalabras++; //Sumamos 1 para contar la última palabra
        int posicionPalabra = 0;
        String palabra = "";
        for (int cont = 0; cont < titulo.length(); cont++) {
            if(titulo.charAt(cont) != ' '){
                palabra += titulo.charAt(cont);
            }else{
                //hemos llegado a un espacio, cogemos la primera letra de la palabra
                iniciales += Character.toUpperCase(palabra.charAt(0));
                palabra = "";
            }
        }
        //Guardar la última palabra
        iniciales += Character.toUpperCase(palabra.charAt(0));

        System.out.println("Título: " + titulo);
        System.out.println("Iniciales: " + iniciales);
    }
}
