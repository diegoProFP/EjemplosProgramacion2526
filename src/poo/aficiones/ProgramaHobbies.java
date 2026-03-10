package poo.aficiones;

public class ProgramaHobbies {

    public static void main(String[] args) {
        Persona[] personitas = new Persona[5];


        Persona tonyHawk = new Persona("Tony Hawk", 57);
        personitas[0] = tonyHawk;


        tonyHawk.setNombreYEdadALaVez("Paquito", 898989898);

        Aficion skate = new Aficion("Skating", true, 8);
        Aficion lectura = new Aficion("Leer libros", false, 1);

        for (int i = 0; i < 50; i++) {
        tonyHawk.agregarHobbie(skate);
        }
        tonyHawk.agregarHobbie(lectura);

        System.out.println("La persona es: " + tonyHawk.getNombre());
        System.out.println("Sus aficiones son: ");
        tonyHawk.mostrarHobbies();

        System.out.println("Ahora los riesgosos...");
        tonyHawk.mostrarHobbiesRiesgosos();

    }
}
