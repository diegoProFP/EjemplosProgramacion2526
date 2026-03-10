package poo.ejercicios;

import java.util.Scanner;

public class PrincipalPersona {

    public static void main(String[] args) {

        System.out.println("La mayoria de edad en el programa es: " + Constantes.MAYORIA_EDAD);
        System.out.println("La edad de jubilacion en el programa es: " + Constantes.EDAD_JUBILACION);


        System.out.println("¿El DNI 1234A es valido? " + Persona.validarDNI("1234A"));
        System.out.println("¿El DNI 12345678A es valido? " + Persona.validarDNI("12345678A"));
        System.out.println("¿El DNI 123456789 es valido? " + Persona.validarDNI("123456789"));

        Persona manuel = new Persona("Manuel", "Berlanga", 74);


        imprimirDatos(manuel);

        System.out.println("Ahora creas tú la persona. Dime nombre");
        Scanner teclado = new Scanner(System.in);
        String nombrePersona = teclado.nextLine();
        System.out.println("Ahora dime los apellidos....");
        String apellidosPersona = teclado.nextLine();
        System.out.println("Ahora dime el DNI....");
        String dniPersona = teclado.nextLine();
        System.out.println("Ahora dime su edad....");
        int edadPersona = teclado.nextInt();

        Persona nuevaPersona = new Persona(nombrePersona,
                                            apellidosPersona,
                                            dniPersona,
                                            edadPersona);

        imprimirDatos(nuevaPersona);

        int diferenciaEntreManuelYPersona = manuel.diferenciaEdad(nuevaPersona);

        System.out.println("Manuel y " + nombrePersona + " se llevan: " + diferenciaEntreManuelYPersona + " años");

        System.out.println("¿Manuel es jubilado? " + manuel.esJubilado());
        System.out.println("¿Manuel es mayor de edad? " + manuel.esMayorEdad());



    }

    public static void imprimirDatos(Persona unaPersona){
        System.out.println("Datos de tu persona: ");

        System.out.println("Nombre: " + unaPersona.getNombre());
        System.out.println("Apellidos: " + unaPersona.getApellidos());
        System.out.println("Dni: " + unaPersona.getDni());
        System.out.println("Edad: " + unaPersona.getEdad());
    }
}
