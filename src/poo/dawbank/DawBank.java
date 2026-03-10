package poo.dawbank;

import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- REGISTRO DE CUENTA ---");
        System.out.print("Introduzca IBAN: ");
        String iban = sc.nextLine();
        System.out.print("Introduzca Titular: ");
        String titular = sc.nextLine();

        // Creamos el objeto de la lógica
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);

        int opcion;
        do {
            System.out.println("\n--- MENÚ BANCARIO ---");
            System.out.println("1. Datos de la cuenta\n2. IBAN\n3. Titular\n4. Saldo");
            System.out.println("5. Ingreso\n6. Retirada\n7. Movimientos\n8. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.imprimirCuentaBancaria();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getNombreCompletoTitular());
                    break;
                case 4:
                    System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
                    break;
                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    if (cuenta.ingresar(sc.nextDouble())) {
                        System.out.println("Ingreso realizado.");
                    } else {
                        System.out.println("Error en el ingreso.");
                    }
                    break;
                case 6:
                    System.out.print("Cantidad a retirar: ");
                    if (cuenta.retirar(sc.nextDouble())) {
                        System.out.println("Retirada realizada.");
                    } else {
                        System.out.println("Saldo insuficiente o cantidad inválida.");
                    }
                    break;
                case 7:
                    System.out.println("--- HISTORIAL ---");
                    cuenta.mostrarMovimientos();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        sc.close();
    }
}
