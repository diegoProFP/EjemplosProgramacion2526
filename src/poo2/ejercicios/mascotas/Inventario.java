package poo2.ejercicios.mascotas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {

        Mascota[] mascotasTienda = generarMascotas(4);

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do{

            generarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    mostrarListaAnimales(mascotasTienda);
                    break;
                case 2:
                    System.out.println("Por favor, diga el nombre de animal");
                    String nombreAnimal = teclado.nextLine();
                    mostrarAnimalPorNombre(mascotasTienda, nombreAnimal);
                    break;
                case 3:
                    System.out.println("Por favor, diga el tipo de animal");
                    String tipoAnimal = teclado.nextLine();
                    mostrarAnimalPorTipo(mascotasTienda, tipoAnimal);
                    break;
                default:
                    System.out.println("La opción " + opcion +" no es una opción válida");
            }

        }while(opcion != 0);


    }

    private static void mostrarAnimalPorNombre(Mascota[] mascotasTienda, String nombreAnimal) {

        for(int cont = 0; cont < mascotasTienda.length; cont++){
            if(mascotasTienda[cont] != null){
                if(mascotasTienda[cont].getNombre().contains(nombreAnimal)){
                    System.out.println("--- MASCOTA ENCONTRADA POR NOMBRE: " + nombreAnimal + " ----");
                    mascotasTienda[cont].muestra();
                }
            }
        }

    }

    private static void mostrarAnimalPorTipo(Mascota[] mascotasTienda, String tipoAnimal) {

        for(int cont = 0; cont < mascotasTienda.length; cont++){
            if(mascotasTienda[cont] != null){
                if(tipoAnimal.equalsIgnoreCase("Perro")
                        && mascotasTienda[cont] instanceof Perro){
                    Perro perrito = (Perro) mascotasTienda[cont];
                    System.out.println("Perro encontrado: ");
                    perrito.muestra();
                }else if(tipoAnimal.equalsIgnoreCase("Loro")
                        && mascotasTienda[cont] instanceof Loro){
                    Loro lorito = (Loro) mascotasTienda[cont];
                    System.out.println("Loro encontrado:");
                    lorito.muestra();
                }
            }
        }

    }

    private static void mostrarListaAnimales(Mascota[] mascotasTienda) {

        for(int cont = 0; cont < mascotasTienda.length; cont++){
            if(mascotasTienda[cont] != null){
                mascotasTienda[cont].muestra();
            }
        }
    }

    private static void generarMenu() {

        System.out.println("*** MENÚ DE LA TIENDA DE MASCOTAS ***");
        System.out.println("1. Mostrar la lista de animales ");
        System.out.println("2. Mostrar todos los datos de un animal concreto (por nombre) ");
        System.out.println("3. Mostrar todos los datos de un animal concreto (por tipo de animal)");
        System.out.println("4. Mostrar todos los datos de todos los animales ");
        System.out.println("5. Insertar animales en el inventario. ");
        System.out.println("6. Eliminar animales del inventario. ");
        System.out.println("7. Vaciar el inventario. ");
        System.out.println("0. Salir. ");

    }


    public static Mascota[] generarMascotas(int numMascotas){
        Mascota[] listaMascotas = new Mascota[4];

        LocalDate fechaNacMilu = LocalDate.of(2020, Month.AUGUST, 15);
        LocalDate fechaNacToby = LocalDate.of(2016, Month.FEBRUARY, 28);
        LocalDate fechaNacManuela = LocalDate.of(2019, Month.APRIL, 10);

        listaMascotas[0] = new Perro("Milú", 6, EstadoMascota.VIVO, fechaNacMilu, "Chucho", false);
        listaMascotas[1] = new Perro("Toby", 10, EstadoMascota.CASTRADO, fechaNacToby, "Chucho", false);
        listaMascotas[2] = new Loro("Manuela", 7, EstadoMascota.VIVO, fechaNacManuela, "Afilado", true, "Canarias", true);

        return listaMascotas;
    }
}
